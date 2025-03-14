package irvine.oeis.a354;
// Generated by gen_seq4.pl 2024-03-27/filter at 2024-03-27 21:37

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.oeis.FilterSequence;
import irvine.oeis.a051.A051682;

/**
 * A354448 11-gonal numbers which are products of two distinct primes.
 * @author Georg Fischer
 */
public class A354448 extends FilterSequence {

  /** Construct the sequence. */
  public A354448() {
    super(1, new A051682(), v -> {
      final FactorSequence fs = Jaguar.factor(v);
      return fs.omega() == 2 && fs.bigOmega() == 2;
    });
  }
}
