package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050765 Composite n added to sum of its prime factors is nextprime(n).
 * @author Sean A. Irvine
 */
public class A050765 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 38399;

  @Override
  public Z next() {
    while (true) {
      Z sum = Z.valueOf(++mN);
      if (!sum.isProbablePrime()) {
        final Z nextPrime = mPrime.nextPrime(sum);
        final FactorSequence fs = Jaguar.factor(mN);
        for (final Z p : fs.toZArray()) {
          sum = sum.add(p.multiply(fs.getExponent(p)));
        }
        if (sum.equals(nextPrime)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

