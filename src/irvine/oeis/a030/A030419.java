package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030419 Length of n-th run of digit 0 in A030413.
 * @author Sean A. Irvine
 */
public class A030419 extends A030413 {

  @Override
  public Z next() {
    while (!super.next().isZero()) {
      // do nothing
    }
    long cnt = 1;
    while (super.next().isZero()) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

