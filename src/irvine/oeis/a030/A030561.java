package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030561 Length of n-th run of digit 5 in A030548.
 * @author Sean A. Irvine
 */
public class A030561 extends A030548 {

  @Override
  public Z next() {
    while (!Z.FIVE.equals(super.next())) {
      // do nothing
    }
    long cnt = 1;
    while (Z.FIVE.equals(super.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

