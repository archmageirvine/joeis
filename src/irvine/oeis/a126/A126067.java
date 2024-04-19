package irvine.oeis.a126;

import irvine.math.IntegerUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.partition.IntegerPartition;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002499;

/**
 * A126067 Triangle read by rows: T(n,k) is the number of unlabeled self-converse digraphs with n nodes and k arcs, k=0..n*(n-1).
 * @author Sean A. Irvine
 */
public class A126067 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A126067(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A126067() {
    super(0);
  }

  // Compare with A002499.

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  private int mN = -1;
  private int mM = 0;
  private Polynomial<Q> mPoly = RING.zero();

  private static boolean eta(final int k) {
    return (k & 3) == 2;
  }

  // See page 152 of "Graphical Enumeration". Note, however, the formula
  // in the book for I(alpha) should say "1<=r<t<=p".

  private static MultivariateMonomial i(final int p, final int[] j, final Z mult) {
    final MultivariateMonomial powers = new MultivariateMonomial();
    for (int k = 1; k <= p; ++k) {
      if (j[k] != 0) { // efficiency only
        final int lcm = IntegerUtils.lcm(2, k);
        final int gcd = IntegerUtils.gcd(2, k);
        powers.add(lcm, gcd * k * ((long) j[k] * j[k] - j[k]) / 2);
      }
    }
    for (int r = 1; r <= p; ++r) {
      for (int t = r + 1; t <= p; ++t) {
        final int k = IntegerUtils.lcm(r, t);
        final int gcd = IntegerUtils.gcd(r, t);
        powers.add(IntegerUtils.lcm(2, k), (long) IntegerUtils.gcd(2, k) * gcd * j[r] * j[t]);
      }
    }
    for (int k = 1; k <= p; k += 2) {
      powers.add(2 * k, (long) ((k - 1) / 2) * j[k]);
    }
    for (int k = 2; k <= p; k += 2) {
      powers.add(k, (long) (k - 2) * j[k]);
      if (eta(k)) {
        powers.add(k / 2, 2L * j[k]);
      } else {
        powers.add(k, j[k]);
      }
    }
    powers.setCoefficient(mult);
    //System.out.println(Arrays.toString(j) + " --> " + Arrays.toString(powers));
    return powers;
  }

  protected static CycleIndex i(final int n) {
    final IntegerPartition partition = new IntegerPartition(n);
    final int[] j = new int[n + 1];
    int[] p;
    final CycleIndex ci = new CycleIndex("F(S_{" + n + "}^{S_2^*}");
    while ((p = partition.next()) != null) {
      IntegerPartition.toCountForm(p, j);
      //System.out.println(Arrays.toString(j));
      ci.add(i(n, j, A002499.h(j)));
    }
    ci.multiply(new Q(Z.ONE, Functions.FACTORIAL.z(n)));
    return ci;
  }

  @Override
  public Z next() {
    if (++mM > mPoly.degree()) {
      mM = 0;
      if (++mN == 0) {
        return Z.ONE;
      }
      final CycleIndex ci = i(mN);
      mPoly = ci.applyOnePlusXToTheN();
      // Note mPoly.eval(1) is A002499(n)
    }
    return mPoly.coeff(mM).toZ();
  }
}
