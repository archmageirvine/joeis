package irvine.oeis.a091;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A091599 Triangle read by rows: T(n,k) is the number of nonseparable planar maps with r*n edges and a fixed outer face of r*k edges which are invariant under a rotation of 1/r for any r &gt;= 2 (independent of actual value of r).
 * @author Sean A. Irvine
 */
public class A091599 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A091599(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A091599() {
    super(1);
  }

  private int mN = 0;
  private int mM = 0;

  protected Z t(final int n, final int k) {
    if (k > n) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int j = k; j <= Math.min(n, 2 * k); ++j) {
      final Z t = Functions.FACTORIAL.z(j - 1)
        .multiply(Functions.FACTORIAL.z(3 * n - j - k - 1))
        .multiply(2L * j - k)
        .divide(Functions.FACTORIAL.z(j - k).square())
        .divide(Functions.FACTORIAL.z(2 * k - j))
        .divide(Functions.FACTORIAL.z(n - j));
      sum = sum.add(t);
    }
    return sum.multiply(k).divide(Functions.FACTORIAL.z(2 * n - k));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
