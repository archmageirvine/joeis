package irvine.oeis.a294;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A294705 Order of the general symplectic group of 4 X 4 matrices over Z_n.
 * @author Georg Fischer
 */
public class A294705 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    // return product([p^(11*n.valuation(p) - 7)*(p - 1)*(p^2 - 1)*(p^4 - 1) for p in n.prime_factors()])
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(p.pow(11L * Functions.VALUATION.i(mN, p) - 7).multiply(p.subtract(Z.ONE)).multiply(p.square().subtract(Z.ONE)).multiply(p.pow(4).subtract(Z.ONE)));
    }
    return prod;
  }
}
