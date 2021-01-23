package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034718 Dirichlet convolution of b_n=n with b_n with b_n.
 * @author Sean A. Irvine
 */
public class A034718 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    final FactorSequence fs = Cheetah.factor(++mN);
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(Binomial.binomial(fs.getExponent(p) + 2, 2));
    }
    return prod.multiply(mN);
  }
}
