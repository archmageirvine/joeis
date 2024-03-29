package irvine.oeis.a318;
// Generated by gen_seq4.pl dirisqrt at 2024-01-11 23:33

import irvine.oeis.DirichletSquareRootSequence;
import irvine.oeis.a001.A001511;

/**
 * A318449 Numerators of the sequence whose Dirichlet convolution with itself yields A001511, the 2-adic valuation of 2n.
 * @author Georg Fischer
 */
public class A318449 extends DirichletSquareRootSequence {

  /** Construct the sequence. */
  public A318449() {
    super(1, new A001511(), NUM);
  }
}
