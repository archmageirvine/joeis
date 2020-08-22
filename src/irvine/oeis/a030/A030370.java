package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030370 Length of n-th run of digit 2 in A030363.
 * @author Sean A. Irvine
 */
public class A030370 extends A030363 {

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

