package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003974 M\u00f6bius transform of A003962.
 * @author Sean A. Irvine
 */
public class A003974 extends Sequence1 {

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final Z q = mPrime.nextPrime(p);
      prod = prod.multiply(q.add(1).divide2().pow(fs.getExponent(p) - 1).multiply(q.subtract(1).divide2()));
    }
    return prod;
  }
}
