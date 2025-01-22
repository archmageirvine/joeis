package irvine.math.function;

import irvine.math.z.Z;

/**
 * Collatz function.
 * @author Sean A. Irvine
 */
class Collatz extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return n.isEven() ? n.divide2() : n.multiply(3).add(1);
  }
}
