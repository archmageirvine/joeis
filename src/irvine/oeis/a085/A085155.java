package irvine.oeis.a085;
// manually 2024-05-21/filnum at 2024-05-27 15:24

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.oeis.FilterNumberSequence;

/**
 * A085155 Powers of semiprimes.
 * @author Georg Fischer
 */
public class A085155 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A085155() {
    super(1, 1, k -> {
      if (k == 1) {
        return true;
      } else {
        final FactorSequence fs = Jaguar.factor(k);
        final int om = fs.omega();
        final int emax = fs.maxExponent();
        if (om == 2) {
          return emax == fs.minExponent(); // some number of exponents for 2 primes
        } else if (om == 1) {
          return (emax & 1) == 0; // even exponent for a single prime
        }
        return false;
      }
    });
  }
}
