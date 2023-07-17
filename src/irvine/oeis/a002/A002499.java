package irvine.oeis.a002;

import irvine.math.IntegerUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.SymmetricGroup;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002499 Number of self-converse digraphs with n nodes.
 * @author Sean A. Irvine
 */
public class A002499 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002499(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002499() {
    super(1);
  }

  // Compare with A126067.  This is effectively the cycle index polynomials
  // evaluated at 1.

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;
  private int mN = 0;

  private boolean eta(final int k) {
    return (k & 3) == 2;
  }

  // Based on formula on p. 155 in "Graphical Enumeration", not error in sum2 bounds in book
  private int sum2(final int p, final int[] j) {
    int s = 0;
    for (int r = 1; r <= p; ++r) {
      for (int t = r + 1; t <= p; ++t) {
        final int gcd = IntegerUtils.gcd(r, t);
        final int lcm = IntegerUtils.lcm(r, t);
        s += IntegerUtils.gcd(2, lcm) * gcd * j[r] * j[t];
      }
    }
    return s;
  }

  // This is the simpler form in the paper -- it seems to get same numbers as above
  private int sum1(final int p, final int[] j) {
    int s = 0;
    for (int k = 1; k <= p; ++k) {
      final int gcd = IntegerUtils.gcd(2, k);
      final int a = (k - 1) * j[k];
      final int b = k * (j[k] * j[k] - j[k]);
      s += gcd * (a + b) / 2;
      if (eta(k)) {
        s += j[k];
      }
    }
    return s;
  }

  protected int epsilon(final int p, final int[] j) {
    return sum1(p, j) + sum2(p, j);
  }

  /*
  // Explicit iteration over permutations, much slower than lpf based approach
  // see circa p. 35 in "Graphical Enumeration"
  public Z nextx() {
    final SymmetricGroup<Integer> sp = SymmetricGroup.create(++mN);
    final int[] j = new int[mN + 1];
    Z s = Z.ZERO;
    for (final Permutation<Integer> alpha : sp) {
      Arrays.fill(j, 0);
      int h = mN;
      for (final List<Integer> cs : alpha.cycleStructure()) {
        j[cs.size()]++;
        h -= cs.size();
      }
      j[1] += h; // Remaining elements must be 1 cycles
      j[0] = 0; // Not necessary --- since it wil be *0 anyway in calculation
      s = s.add(Z.ONE.shiftLeft(epsilon(mN, j)));
    }
    return s.divide(mFactorial.factorial(mN));
  }
  */

  /**
   * h function.
   * @param j partition in count form
   * @return <code>h(j)</code>
   */
  public static Z h(final int[] j) {
    return FACTORIAL.factorial(j.length - 1).divide(SymmetricGroup.per(j));
  }

  @Override
  public Z next() {
    final IntegerPartition partition = new IntegerPartition(++mN);
    final int[] j = new int[mN + 1];
    int[] p;
    Z s = Z.ZERO;
    while ((p = partition.next()) != null) {
      IntegerPartition.toCountForm(p, j);
      s = s.add(h(j).shiftLeft(epsilon(mN, j)));
    }
    return s.divide(FACTORIAL.factorial(mN));
  }
}
