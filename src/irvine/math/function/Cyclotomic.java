package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Cyclotomic functions.
 * @author A. Kruppa
 * @author Sean A. Irvine
 */
class Cyclotomic extends AbstractFunction2 {

  /**
   * If n is a perfect power of a prime, return that prime, otherwise return 1.
   * @param n value to test
   * @return 1 or a prime
   */
  private static Z isPrimePower(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    return fs.omega() == 1 ? fs.toZArray()[0] : Z.ONE;
  }

  @Override
  public Z z(Z n, Z m) {
    if (n.signum() < 0) {
      throw new ArithmeticException("n must be nonnegative");
    }
    if (n.isZero()) {
      return m;
    }
    if (n.equals(Z.ONE)) {
      return m.subtract(Z.ONE);
    }
    if (m.isZero()) {
      return Z.ONE;
    }
    if (Z.NEG_ONE.equals(m)) {
      if (n.isOdd()) {
        n = n.multiply2();
      } else {
        n = n.divide2();
      }
      if (n.equals(Z.ONE)) {
        return Z.ZERO;
      }
      m = Z.ONE;
    }
    if (Z.ONE.equals(m)) {
      return isPrimePower(n);
    }
    Z p = Z.ONE;
    Z q = Z.ONE;
    for (Z i = Z.ONE; i.compareTo(n) <= 0; i = i.add(1)) {
      if (n.mod(i).isZero()) {
        final int mu = Functions.MOBIUS.i(n.divide(i));
        if (mu != 0) {
          final Z t = m.pow(i).subtract(Z.ONE);
          if (mu == 1) {
            p = p.multiply(t);
          } else {
            q = q.multiply(t);
          }
        }
      }
    }
    final Z[] qr = p.divideAndRemainder(q);
    assert qr[1].isZero();
    return qr[0];
  }
}
