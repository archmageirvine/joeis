package irvine.oeis.a011;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011262 In the prime factorization of n, increment odd powers and decrement even powers (multiplicative and <code>self-inverse)</code>.
 * @author Sean A. Irvine
 */
public class A011262 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      prod = prod.multiply(p.pow((e & 1) == 0 ? e - 1 : e + 1));
    }
    return prod;
  }
}

