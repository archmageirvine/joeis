package irvine.oeis.a351;
// Generated by gen_seq4.pl 2024-03-27/filter at 2024-03-27 21:37

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000566;

/**
 * A351867 Heptagonal numbers which are products of four distinct primes.
 * @author Georg Fischer
 */
public class A351867 extends FilterSequence {

  /** Construct the sequence. */
  public A351867() {
    super(1, new A000566(), v -> {
      final FactorSequence fs = Jaguar.factor(v);
      return fs.omega() == 4 && fs.bigOmega() == 4;
    });
  }
}
