package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030368 Length of n-th run of digit 0 in A030363.
 * @author Sean A. Irvine
 */
public class A030368 extends A030363 {

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

