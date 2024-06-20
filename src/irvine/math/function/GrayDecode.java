package irvine.math.function;

import irvine.math.z.Z;

/**
 * Gray decoding of a number.
 * @author Sean A. Irvine
 */
class GrayDecode extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    Z t = n;
    Z r = Z.ZERO;
    while (!t.isZero()) {
      r = r.xor(t);
      t = t.divide2();
    }
    return r;
  }

  @Override
  public long l(final long n) {
    long t = n;
    long r = 0;
    while (t != 0) {
      r ^= t;
      t >>>= 1;
    }
    return r;
  }
}
