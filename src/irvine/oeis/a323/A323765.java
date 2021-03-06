package irvine.oeis.a323;
// Generated by gen_seq4.pl dirichcop2 at 2021-04-24 00:16
// DO NOT EDIT here!

import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000009;
import irvine.oeis.a000.A000041;

/**
 * A323765 Dirichlet convolution of the integer partition numbers A000041 with the strict partition numbers A000009.
 * @author Georg Fischer
 */
public class A323765 extends PrependSequence {

  /** Construct the sequence. */
  public A323765() {
    super(new DirichletConvolutionSequence(new A000041(), 0, new A000009(), 0), 1);
  }
}
