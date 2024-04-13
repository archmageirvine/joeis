package irvine.math.function;

import irvine.math.z.Z;

/**
 * Ceiling square root.
 * @author Sean A. Irvine
 */
class CeilSqrt extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    final Z[] s = n.sqrtAndRemainder();
    return s[1].isZero() ? s[0] : s[0].add(1);
  }
}
