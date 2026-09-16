package irvine.oeis.a086;

import irvine.math.z.Z;

/**
 * A086583 Self-convolution of A086582; the first 2^n terms of this sequence gives the 2^n terms that follow the 2^n-th term of A086582.
 * @author Sean A. Irvine
 */
public class A086583 extends A086582 {

  private long mN = -1;
  private long mLim = 0;

  @Override
  public Z next() {
    if (mN < 0) {
      ++mN;
      super.next();
      return super.next();
    }
    if (++mN >= mLim) {
      mLim = mLim == 0 ? 1 : mLim * 2;
      for (long k = 0; k < mLim; ++k) {
        super.next();
      }
      mN = 0;
    }
    return super.next();
  }
}
