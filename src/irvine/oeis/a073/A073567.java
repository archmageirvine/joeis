package irvine.oeis.a073;
// Generated by gen_seq4.pl 2023-12-27/filter at 2023-12-27 11:35

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000027;

/**
 * A073567 Numbers k such that sigma(k) = phi(k)*omega(k).
 * @author Georg Fischer
 */
public class A073567 extends FilterSequence {

  /** Construct the sequence. */
  public A073567() {
    super(1, new A000027(), (n, v) -> {
      final FactorSequence fs = Jaguar.factor(n);
      return fs.sigma().equals(fs.phi().multiply(fs.omega()));
    });
  }
}
