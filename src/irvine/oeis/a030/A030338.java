package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a003.A003137;

/**
 * A030338 Length of n-th run of digit 2 in <code>A003137</code>.
 * @author Sean A. Irvine
 */
public class A030338 extends A003137 {

  @Override
  public Z next() {
    while (!Z.TWO.equals(super.next())) {
      // do nothing
    }
    long cnt = 1;
    while (Z.TWO.equals(super.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

