package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a003.A003137;

/**
 * A030337 Length of n-th run of digit 1 in <code>A003137</code>.
 * @author Sean A. Irvine
 */
public class A030337 extends A003137 {

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

