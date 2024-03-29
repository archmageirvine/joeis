package irvine.oeis.a318;
// Generated by gen_seq4.pl dirisqrt at 2024-01-11 23:33

import irvine.oeis.DirichletSquareRootSequence;
import irvine.oeis.a003.A003961;

/**
 * A318321 Numerators of rational valued sequence whose Dirichlet convolution with itself yields A003961.
 * @author Georg Fischer
 */
public class A318321 extends DirichletSquareRootSequence {

  /** Construct the sequence. */
  public A318321() {
    super(1, new A003961(), NUM);
  }
}
