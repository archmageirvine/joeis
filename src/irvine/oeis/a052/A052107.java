package irvine.oeis.a052;

import irvine.math.IntegerUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A052107 Number of self-complementary 3-multigraphs on n nodes.
 * @author Sean A. Irvine
 */
public class A052107 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A052107(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A052107() {
    super(1);
  }

  // After Andrew Howroyd

  protected final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  protected int mN = 0;

  protected int edges(final int[] v) {
    int sum = 0;
    for (int i = 1; i < v.length; ++i) {
      for (int j = 0; j < i; ++j) {
        sum += IntegerUtils.gcd(v[i], v[j]);
      }
    }
    sum *= 4;
    for (final int j : v) {
      sum += 2L * j;
    }
    return sum;
  }

  @Override
  public Z next() {
    if ((++mN & 3) < 2) {
      if (mN == 1) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      final IntegerPartition part = new IntegerPartition(mN / 4);
      int[] p;
      while ((p = part.next()) != null) {
        final Z t = IntegerPartition.permCount(p, 4).shiftLeft(2L * edges(p));
        sum = sum.add(t.multiply((mN & 1) == 1 ? Z.valueOf(mN).shiftLeft(2L * p.length) : Z.ONE));
      }
      return sum.divide(Functions.FACTORIAL.z(mN));
    } else {
      return Z.ZERO;
    }
  }
}
