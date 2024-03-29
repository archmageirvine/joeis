package irvine.oeis.a317;
// Generated by gen_seq4.pl dirisqrt at 2024-01-11 23:33

import irvine.oeis.DirichletSquareRootSequence;
import irvine.oeis.a000.A000203;

/**
 * A317831 Numerators of rational valued sequence f whose Dirichlet convolution with itself yields A000203 (sigma, the sum of divisors).
 * @author Georg Fischer
 */
public class A317831 extends DirichletSquareRootSequence {

  /** Construct the sequence. */
  public A317831() {
    super(1, new A000203(), NUM);
  }
}
