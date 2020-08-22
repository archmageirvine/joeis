package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031230 Length of n-th run of digit 4 in A031219.
 * @author Sean A. Irvine
 */
public class A031230 extends A031219 {

  @Override
  public Z next() {
    while (!Z.FOUR.equals(super.next())) {
      // do nothing
    }
    long cnt = 1;
    while (Z.FOUR.equals(super.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

