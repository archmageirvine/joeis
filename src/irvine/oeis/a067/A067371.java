package irvine.oeis.a067;
// manually 2021-08-04

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a003.A003586;

/**
 * A067371 Arithmetic derivatives of 3-smooth numbers.
 * @author Georg Fischer
 */
public class A067371 extends A003586 {

  @Override
  public Z next() {
    final Z n = super.next();
    if (n.compareTo(Z.TWO) < 0) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(n);
    Z result = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      result = result.add(n.divide(p).multiply(fs.getExponent(p)));
    }
    return result;
  }
}
