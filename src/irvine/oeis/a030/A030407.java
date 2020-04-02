package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030407 Length of n-th run of digit 0 in <code>A030401</code>.
 * @author Sean A. Irvine
 */
public class A030407 extends A030401 {

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

