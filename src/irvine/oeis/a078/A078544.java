package irvine.oeis.a078;
// Generated by gen_seq4.pl 2024-04-05/filter at 2024-04-05 23:22

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.oeis.FilterSequence;
import irvine.oeis.a015.A015761;

/**
 * A078544 Non-balanced numbers in A015761.
 * @author Georg Fischer
 */
public class A078544 extends FilterSequence {

  /** Construct the sequence. */
  public A078544() {
    super(1, new A015761(), v -> {
      final FactorSequence fs = Jaguar.factor(v);
      return !fs.sigma().mod(fs.phi()).isZero();
    });
  }
}
