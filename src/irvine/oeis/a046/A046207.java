package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a003.A003506;

/**
 * A046207 Numbers to the right of the central elements in the triangle of denominators in Leibniz's Harmonic Triangle.
 * @author Sean A. Irvine
 */
public class A046207 extends A003506 {

  private long mSkip = 1;
  private long mM = -1;
  private boolean mFirst = false;
  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      if (++mM < mSkip) {
        return super.next();
      }
      if (mFirst) {
        mFirst = false;
        mM = -1;
      } else {
        mFirst = true;
        ++mSkip;
        mM = 0;
      }
      for (long k = 0; k < mSkip; ++k) {
        super.next();
      }
    }
  }
}
