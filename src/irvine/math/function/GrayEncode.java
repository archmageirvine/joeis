package irvine.math.function;

import irvine.math.z.Z;

/**
 * Gray encoding of a number.
 * @author Sean A. Irvine
 */
class GrayEncode extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return n.xor(n.divide2());
  }

  @Override
  public long l(final long n) {
    return n ^ (n / 2);
  }

  @Override
  public int i(final int n) {
    return n ^ (n / 2);
  }
}
