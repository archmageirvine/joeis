package irvine.oeis.a318;
// Generated by gen_seq4.pl dirisqrt at 2024-01-11 23:33

import irvine.oeis.DirichletSquareRootSequence;
import irvine.oeis.a065.A065769;

/**
 * A318669 Numerators of the sequence whose Dirichlet convolution with itself yields A065769 ("Prime cascade").
 * @author Georg Fischer
 */
public class A318669 extends DirichletSquareRootSequence {

  /** Construct the sequence. */
  public A318669() {
    super(1, new A065769(), NUM);
  }
}
