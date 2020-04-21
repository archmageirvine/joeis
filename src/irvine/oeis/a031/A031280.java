package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031280 Length of n-th run of digit 4 in <code>A031269</code>.
 * @author Sean A. Irvine
 */
public class A031280 extends A031269 {

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

