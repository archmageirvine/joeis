package irvine.oeis.a163;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A163836 Composites whose largest prime factor is equal to the sum of all the other prime factors (with repetition).
 * @author Sean A. Irvine
 */
public class A163836 implements Sequence {

  private long mN = 3;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        final FactorSequence fs = Jaguar.factor(mN);
        Z largest = Z.ZERO;
        Z sum = Z.ZERO;
        for (final Z p : fs.toZArray()) {
          final int e = fs.getExponent(p);
          sum = sum.add(p.multiply(e));
          if (p.compareTo(largest) > 0) {
            largest = p;
          }
        }
        if (sum.equals(largest.multiply2())) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

