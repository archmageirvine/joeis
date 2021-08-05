package irvine.oeis.a051;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051378 Sum of (1+e)-divisors of n. Let n = Product_i p(i)^r(i) then (1+e)-sigma(n) = Product_i (1 + Sum_{s|r(i)} p(i)^s) .
 * @author Sean A. Irvine
 */
public class A051378 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      Z sum = Z.ONE;
      for (final Z d : Cheetah.factor(fs.getExponent(p)).divisors()) {
        sum = sum.add(p.pow(d));
      }
      prod = prod.multiply(sum);
    }
    return prod;
  }
}

