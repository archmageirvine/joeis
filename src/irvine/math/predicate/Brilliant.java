package irvine.math.predicate;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Test if a number is (k-)brilliant: semiprime = 2-smooth or k-smooth, and all primes have the same decimal length (see A078972).
 * @author Georg Fischer
 */
public class Brilliant extends AbstractPredicate2 {

  @Override
  public long getDefault() {
    return 2; // default: test semiprimes
  }

  @Override
  public boolean is(final long smooth, final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    final Z[] p = fs.toZArray();
    if (fs.bigOmega() == smooth) {
      int k = 0;
      final int len =  Functions.DIGIT_LENGTH.i(p[k]);
      while (++k < p.length) {
        if (Functions.DIGIT_LENGTH.i(p[k]) != len) {
          return false;
        }
      }
      return true;
    } else {
      return false;
    }
  }

  @Override
  public boolean is(final long smooth, final long n) { 
    return is(smooth, Z.valueOf(n));
  }
}
