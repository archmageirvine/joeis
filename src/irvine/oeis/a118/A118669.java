package irvine.oeis.a118;
// Generated by gen_seq4.pl 2024-04-05/filnum at 2024-04-05 23:22

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.oeis.FilterNumberSequence;

/**
 * A118669 Numbers that are not squarefree, but contain their squarefree kernel in decimal representation.
 * @author Georg Fischer
 */
public class A118669 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A118669() {
    super(1, 1, k -> {
      final FactorSequence fs = Jaguar.factor(k);
      return !fs.isSquareFree() && k.toString().indexOf(fs.squareFreeKernel().toString()) >= 0;
    });
  }
}
