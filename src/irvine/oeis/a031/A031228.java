package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031228 Length of n-th run of digit 2 in A031219.
 * @author Sean A. Irvine
 */
public class A031228 extends A031219 {

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

