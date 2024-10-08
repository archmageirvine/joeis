package irvine.oeis.a110;
// Generated by gen_seq4.pl 2024-04-01/filnum at 2024-04-01 22:42

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.oeis.FilterNumberSequence;

/**
 * A110085 Numbers k such that sigma(k) - phi(k) &lt; tau(k)^omega(k), where sigma = A000203, phi = A000010, tau = A000005 and omega = A001221.
 * @author Georg Fischer
 */
public class A110085 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A110085() {
    super(1, 1, k -> {
      final FactorSequence fs = Jaguar.factor(k);
      return fs.sigma().subtract(fs.phi()).compareTo(fs.tau().pow(fs.omega())) < 0;
    });
  }
}
