package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023514 <code>a(n) =</code> sum of exponents in prime-power factorization of <code>prime(n) + 1</code>.
 * @author Sean A. Irvine
 */
public class A023514 extends A000040 {

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(super.next().add(1));
    Z sum = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(fs.getExponent(p));
    }
    return sum;
  }
}
