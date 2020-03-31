package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030346 Length of n-th run of digit 0 in <code>A030341</code>.
 * @author Sean A. Irvine
 */
public class A030346 extends A030341 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    long cnt = 1;
    if (mFirst) {
      mFirst = false;
      --cnt;
    } else {
      while (!Z.ZERO.equals(super.next())) {
        // do nothing
      }
    }
    while (Z.ZERO.equals(super.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

