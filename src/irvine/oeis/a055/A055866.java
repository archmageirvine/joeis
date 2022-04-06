package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055866 Largest number that has the same number of digits in base 10 and base n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A055866 extends A055818 {

  private static final Z[] SMALL = {
    null,
    null,
    Z.ONE,
    Z.TWO,
    Z.valueOf(15),
    Z.valueOf(124),
    Z.valueOf(1295),
    Z.valueOf(117648),
    Z.valueOf(1073741823),
    new Z("109418989131512359208"),
    Z.ZERO,
    new Z("9999999999999999999999999"),
    Z.valueOf(9999999999999L),
    Z.valueOf(999999999),
    Z.valueOf(9999999),
    Z.valueOf(999999),
    Z.valueOf(99999),
    Z.valueOf(99999),
    Z.valueOf(9999),
    Z.valueOf(9999),
    Z.valueOf(9999),
    Z.valueOf(9999),
  };
  private static final Z Z99 = Z.valueOf(99);
  private static final Z Z999 = Z.valueOf(999);
  private int mN = 1;

  @Override
  public Z next() {
    if (++mN < SMALL.length) {
      return SMALL[mN];
    }
    if (mN <= 31) {
      return Z999;
    }
    if (mN <= 99) {
      return Z99;
    }
    return Z.NINE;
  }
}
