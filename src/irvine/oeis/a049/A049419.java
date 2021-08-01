package irvine.oeis.a049;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049419 a(1) = 1; for n &gt; 1, a(n) = number of exponential divisors of n.
 * @author Sean A. Irvine
 */
public class A049419 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    final FactorSequence fs = Cheetah.factor(++mN);
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(Cheetah.factor(fs.getExponent(p)).sigma0());
    }
    return prod;
  }
}

