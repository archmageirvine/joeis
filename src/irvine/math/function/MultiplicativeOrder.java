package irvine.math.function;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;

/**
 * Multiplicative order of a number in the integers modulo a small number.
 * @author Sean A. Irvine
 */
class MultiplicativeOrder extends AbstractFunction2 {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public Z z(final long base, Z n) {
    return base == 1 ? Z.ONE : new IntegersModMul(base).order(n);
  }
}
