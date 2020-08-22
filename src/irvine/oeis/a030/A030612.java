package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030612 Length of n-th run of digit 0 in A030604.
 * @author Sean A. Irvine
 */
public class A030612 extends A030604 {

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

