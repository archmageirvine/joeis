package irvine.oeis.a338;
// Generated by gen_seq4.pl 2025-03-28.ack/filnum at 2025-03-28 22:47

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.oeis.FilterNumberSequence;

/**
 * A338325 Biquadratefree powerful numbers: numbers whose exponents in their prime factorization are either 2 or 3.
 * @author Georg Fischer
 */
public class A338325 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A338325() {
    super(1, 0, k -> {
      final FactorSequence fs = Jaguar.factor(k);
      return k == 1 || (fs.minExponent() >= 2 && fs.maxExponent() <= 3);
    });
  }
}
