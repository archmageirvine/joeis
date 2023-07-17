package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A038107 Number of primes &lt; n^2.
 * @author Sean A. Irvine
 */
public class A038107 extends A000720 {

  /** Construct the sequence. */
  public A038107() {
    super(0);
  }

  private long mN = 0;
  private long mLim = 0;
  private long mSquareM1 = 0;

  @Override
  public Z next() {
    if (mLim == 0) {
      ++mLim;
      return Z.ZERO;
    }
    while (mN < mSquareM1) {
      ++mN;
      super.next();
    }
    ++mN;
    mSquareM1 = ++mLim * mLim - 1;
    return super.next();
  }
}
