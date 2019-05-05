package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020907.
 * @author Sean A. Irvine
 */
public class A020907 extends A020906 {

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
