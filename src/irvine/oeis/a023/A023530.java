package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * A023530 Sum of exponents in prime-power factorization of <code>p(n)*p(n-1) + 1</code>.
 * @author Sean A. Irvine
 */
public class A023530 extends A023523 {

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(super.next());
    Z sum = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(fs.getExponent(p));
    }
    return sum;
  }
}
