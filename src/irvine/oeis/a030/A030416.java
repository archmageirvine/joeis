package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030416 Position of n-th 2 in A030413.
 * @author Sean A. Irvine
 */
public class A030416 extends A030413 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.TWO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

