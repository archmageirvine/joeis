package irvine.oeis.a318;
// Generated by gen_seq4.pl dirisqrt at 2024-01-11 23:33

import irvine.oeis.DirichletSquareRootSequence;
import irvine.oeis.a046.A046523;

/**
 * A318323 Numerators of rational valued sequence whose Dirichlet convolution with itself yields A046523, smallest number with same prime signature as n.
 * @author Georg Fischer
 */
public class A318323 extends DirichletSquareRootSequence {

  /** Construct the sequence. */
  public A318323() {
    super(1, new A046523(), NUM);
  }
}
