package irvine.oeis.a091;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A091665 Triangle read by rows: T(n,k) is the number of nonseparable planar maps with 2*n+1 edges and a fixed outer face of 2*k edges which are invariant under a rotation of a 1/2 turn.
 * @author Sean A. Irvine
 */
public class A091665 extends AbstractSequence {

  /** Construct the sequence. */
  public A091665() {
    super(1);
  }

  private int mN = 0;
  private int mM = 0;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  protected Z t(final int n, final int k) {
    if (k > n) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int j = k; j <= Math.min(n, 2 * k - 1); ++j) {
      final Z t = mF.factorial(j - 1)
        .multiply(mF.factorial(3 * n - j - k))
        .multiply(2L * j - k + 1)
        .divide(mF.factorial(j - k))
        .divide(mF.factorial(j - k + 1))
        .divide(mF.factorial(2 * k - j - 1))
        .divide(mF.factorial(n - j));
      sum = sum.add(t);
    }
    return sum.multiply(k).divide(mF.factorial(2 * n - k + 1));
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
