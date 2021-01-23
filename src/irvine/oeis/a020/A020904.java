package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020904 Positions of 2 in A020903; complement of A191777.
 * @author Sean A. Irvine
 */
public class A020904 extends A020903 {

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
