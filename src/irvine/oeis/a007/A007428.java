package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007428 Moebius transform applied thrice to sequence <code>1,0,0,0,...</code>.
 * @author Sean A. Irvine
 */
public class A007428 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    final FactorSequence fs = Cheetah.factor(++mN);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      prod = prod.multiply(Binomial.binomial(3, e));
      if ((e & 1) == 1) {
        prod = prod.negate();
      }
    }
    return prod;
  }
}
