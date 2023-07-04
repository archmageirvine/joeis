package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.oeis.memory.MemoryFunctionSequence;
import irvine.math.z.Z;

/**
 * A007653 Coefficients of L-series for elliptic curve "37a1": y^2 + y = x^3 - x.
 * @author Sean A. Irvine
 */
public class A007653 extends MemoryFunctionSequence<Z, Long> {

  private long mN = 0;

  // Number of solutions to y^2+y == x^3-x (mod p), p prime, excluding infinity
  @Override
  protected Long compute(final Z p) {
    long cnt = 0;
    for (Z x = Z.ZERO; x.compareTo(p) < 0; x = x.add(1)) {
      final Z xp = x.pow(3).add(p).subtract(x).mod(p);
      for (Z y = Z.ZERO; y.compareTo(p) < 0; y = y.add(1)) {
        if (y.square().add(y).mod(p).equals(xp)) {
          ++cnt;
        }
      }
    }
    return cnt;
  }

  private Z a(final Z p, final int exponent) {
    if (exponent <= 0) {
      return Z.ONE;
    }
    final Z c = p.subtract(get(p));
    if (exponent == 1) {
      return c;
    }
    return c.multiply(a(p, exponent - 1)).subtract(p.multiply(a(p, exponent - 2)));
  }

  @Override
  public Z next() {
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(a(p, fs.getExponent(p)));
    }
    return prod;
  }
}
