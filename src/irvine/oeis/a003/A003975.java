package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003975 Inverse M\u00f6bius transform of A003962.
 * @author Sean A. Irvine
 */
public class A003975 implements Sequence {

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final Z q = mPrime.nextPrime(p).add(1).divide2();
      prod = prod.multiply(q.pow(fs.getExponent(p) + 1).subtract(1).divide(q.subtract(1)));
    }
    return prod;
  }
}
