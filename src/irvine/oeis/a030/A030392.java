package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030392 Length of n-th run of digit 0 in <code>A030386</code>.
 * @author Sean A. Irvine
 */
public class A030392 extends A030386 {

  @Override
  public Z next() {
    while (!Z.ZERO.equals(super.next())) {
      // do nothing
    }
    long cnt = 1;
    while (Z.ZERO.equals(super.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

