package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051917 Inverse of n under Nim (or Conway) multiplication.
 * @author Sean A. Irvine
 */
public class A051917 extends A051775 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = Z.ZERO;
    while (true) {
      m = m.add(1);
      if (Z.ONE.equals(get(mN, m))) {
        return m;
      }
    }
  }
}
