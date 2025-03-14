package irvine.oeis.a354;
// Generated by gen_seq4.pl 2024-03-27/filter at 2024-03-27 21:37

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.oeis.FilterSequence;
import irvine.oeis.a051.A051682;

/**
 * A354086 11-gonal numbers which are products of four distinct primes.
 * @author Georg Fischer
 */
public class A354086 extends FilterSequence {

  /** Construct the sequence. */
  public A354086() {
    super(1, new A051682(), v -> {
      final FactorSequence fs = Jaguar.factor(v);
      return fs.omega() == 4 && fs.bigOmega() == 4;
    });
  }
}
