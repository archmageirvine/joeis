package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000974.
 * @author Sean A. Irvine
 */
public class A000974 extends A000954 {

  @Override
  public Z next() {
    update();
    long c = 0;
    for (long k = mCount.length() / 2; k > 0; --k) {
      if (mCount.get(k) == mN) {
        if (c == 0) {
          mPrev = 2 * k;
        }
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

