package irvine.oeis.a011;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011264 In the prime factorization of <code>n,</code> increment even powers and decrement odd powers (multiplicative).
 * @author Sean A. Irvine
 */
public class A011264 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      prod = prod.multiply(p.pow((e & 1) == 1 ? e - 1 : e + 1));
    }
    return prod;
  }
}

