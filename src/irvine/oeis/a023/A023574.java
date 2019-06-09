package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023574 Sum of exponents in prime-power factorization of <code>p(n)-3</code>.
 * @author Sean A. Irvine
 */
public class A023574 extends A000040 {

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(super.next().subtract(3).abs());
    Z sum = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(fs.getExponent(p));
    }
    return sum;
  }
}
