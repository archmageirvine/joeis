package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030420 Length of n-th run of digit 1 in A030413.
 * @author Sean A. Irvine
 */
public class A030420 extends A030413 {

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      // do nothing
    }
    long cnt = 1;
    while (Z.ONE.equals(super.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

