package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030614 Length of n-th run of digit 2 in A030604.
 * @author Sean A. Irvine
 */
public class A030614 extends A030604 {

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

