package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030414 Position of n-th 0 in A030413.
 * @author Sean A. Irvine
 */
public class A030414 extends A030413 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ZERO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

