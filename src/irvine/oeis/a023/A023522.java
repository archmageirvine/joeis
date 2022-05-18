package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * A023522 Sum of exponents in prime-power factorization of p(n)*p(n-1) - 1.
 * @author Sean A. Irvine
 */
public class A023522 extends A023515 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(super.next());
    Z sum = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(fs.getExponent(p));
    }
    return sum;
  }
}
