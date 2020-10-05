package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035243 Positive numbers of the form x^2+xy+5y^2 (discriminant -19).
 * @author Sean A. Irvine
 */
public class A035243 extends A035171 {

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

