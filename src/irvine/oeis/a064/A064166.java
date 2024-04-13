package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002808;

/**
 * A064166 Composite numbers the sum of the digits in the prime factors of which, with repetition, is prime.
 * @author Sean A. Irvine
 */
public class A064166 extends AbstractSequence {

  private final A002808 mSeq1 = new A002808();

  /** Construct the sequence. */
  public A064166() {
    super(0);
  }

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      final Z c = mSeq1.next();
      final FactorSequence fs = Jaguar.factor(c);
      long sum = 0;
      for (final Z p : fs.toZArray()) {
        sum += Functions.DIGIT_SUM.l(p) * fs.getExponent(p);
      }
      if (mPrime.isPrime(sum)) {
        return c;
      }
    }
  }
}

