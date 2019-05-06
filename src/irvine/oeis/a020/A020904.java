package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020904 Positions of 2 in <code>A020903</code>; complement of <code>A191777</code>.
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
