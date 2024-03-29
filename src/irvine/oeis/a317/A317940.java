package irvine.oeis.a317;
// Generated by gen_seq4.pl dirisqrt at 2024-01-11 23:33

import irvine.oeis.DirichletSquareRootSequence;
import irvine.oeis.a046.A046644;

/**
 * A317940 Numerators of sequence whose Dirichlet convolution with itself yields A046644.
 * @author Georg Fischer
 */
public class A317940 extends DirichletSquareRootSequence {

  /** Construct the sequence. */
  public A317940() {
    super(1, new A046644(), NUM);
  }
}
