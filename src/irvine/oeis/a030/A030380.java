package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030380.
 * @author Sean A. Irvine
 */
public class A030380 extends A030373 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    long cnt = 1;
    if (mFirst) {
      mFirst = false;
      --cnt;
    } else {
      while (!Z.ONE.equals(super.next())) {
        // do nothing
      }
    }
    while (Z.ONE.equals(super.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

