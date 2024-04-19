package irvine.math.function;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Expand the number into a factorial base representation.
 * @author Sean A. Irvine
 */
class FactorialBase extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    Z res = Z.ZERO;
    for (final Z t : ZUtils.factorialBaseList(n)) {
      if (t.compareTo(Z.TEN) >= 0) {
        throw new RuntimeException("Expansion resulted in value >= 10");
      }
      res = res.multiply(10).add(t);
    }
    return res;
  }
}
