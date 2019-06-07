package irvine.oeis.a002;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002322 Reduced totient function <code>psi(n)</code>: least k such that <code>x^k == 1 (mod n)</code> for all x prime to n; also known as the Carmichael lambda function (exponent of unit group <code>mod n)</code>; also called the universal exponent of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A002322 implements Sequence {

  // Carmichael lambda function

  private final PrimeDivision mFactor = new PrimeDivision();
  protected long mN = 0;

  protected Z lambda(final long n) {
    final FactorSequence fs = mFactor.factorize(Z.valueOf(n));
    Z lambda = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (Z.TWO.equals(p)) {
        if (e > 2) {
          lambda = lambda.lcm(Z.ONE.shiftLeft(e - 2));
        } else if (e == 2) {
          lambda = lambda.lcm(Z.TWO);
        }
      } else {
        lambda = lambda.lcm(p.subtract(1).multiply(p.pow(e - 1)));
      }
    }
    return lambda;
  }

  @Override
  public Z next() {
    return lambda(++mN);
  }
}
