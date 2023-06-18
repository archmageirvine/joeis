package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002808;

/**
 * A064158.
 * @author Sean A. Irvine
 */
public class A064166 extends A002808 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final FactorSequence fs = Jaguar.factor(c);
      long sum = 0;
      for (final Z p : fs.toZArray()) {
        sum += ZUtils.digitSum(p) * fs.getExponent(p);
      }
      if (mPrime.isPrime(sum)) {
        return c;
      }
    }
  }
}

