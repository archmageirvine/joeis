package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035251 Positive numbers of the form x^2 - 2y^2 with integers x, y.
 * @author Sean A. Irvine
 */
public class A035251 extends A035185 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (!Z.ZERO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

