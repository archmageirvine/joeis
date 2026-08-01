package irvine.oeis.a086;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086171 Continued fraction of Sum_{n&gt;=1} (prime(n)/10^b(n)), where b(n) = 1 + the total number of digits of the first n-1 primes, A068670.
 * @author Sean A. Irvine
 */
public class A086171 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A086171() {
    super(0, new DecimalExpansionSequence(new CR() {
      private final Fast mPrime = new Fast();
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        long p = 1;
        Z sum = Z.ZERO;
        Z pow = Z.TEN;
        while (true) {
          p = mPrime.nextPrime(p);
          final Z t = one.multiply(p).divide(pow);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
          pow = pow.multiply(Z.TEN.pow(Functions.DIGIT_LENGTH.l(p)));
        }
      }
    }));
  }
}
