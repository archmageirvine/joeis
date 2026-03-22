package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a393.A393708;

/**
 * A084269.
 * @author Sean A. Irvine
 */
public class A394224 extends FilterSequence {

  /** Construct the sequence. */
  public A394224() {
    super(1, new A393708(), k -> {
      final FactorSequence fs = Jaguar.factor(k);
      final Z[] primes = fs.toZArray();
      for (final Z p : primes) {
        for (final Z q : primes) {
          if (p.equals(q)) {
            break;
          }
          if (Functions.GCD.i(fs.getExponent(p), fs.getExponent(q)) != 1) {
            return false;
          }
        }
      }
      return true;
    });
  }
}
