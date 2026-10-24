package irvine.math.predicate;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Test if a number is (k-)brilliant: semiprime = 2-smooth or k-smooth, and all primes have the same decimal length (see A078972).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class Brilliant extends AbstractPredicate2 {

  @Override
  public long getDefault() {
    return 2; // default: test semiprimes
  }

  @Override
  public boolean is(final long k, final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    if (fs.bigOmega() != k) {
      return false;
    }
    final Z[] p = fs.toZArray();
    return Functions.DIGIT_LENGTH.i(p[0]) == Functions.DIGIT_LENGTH.i(p[p.length - 1]);
  }

  @Override
  public boolean is(final long k, final long n) {
    return is(k, Z.valueOf(n));
  }
}
