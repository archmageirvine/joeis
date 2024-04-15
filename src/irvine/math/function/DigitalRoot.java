package irvine.math.function;

import irvine.math.z.Z;

/**
 * Digital root.
 * @author Sean A. Irvine
 */
class DigitalRoot extends AbstractFunction1 {

  @Override
  public long l(final long n) {
    return n < 10 ? n : l(Functions.DIGIT_SUM.l(n));
  }

  @Override
  public long l(final Z n) {
    return n.compareTo(Z.TEN) < 0 ? n.longValue() : l(Functions.DIGIT_SUM.l(n));
  }

  @Override
  public Z z(final Z n) {
    return Z.valueOf(l(n));
  }
}
