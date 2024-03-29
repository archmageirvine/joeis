package irvine.oeis.a318;
// Generated by gen_seq4.pl dirichcon at 2021-04-24 00:16
// DO NOT EDIT here!

import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a001.A001222;

/**
 * A318366 a(n) = Sum_{d|n} bigomega(d)*bigomega(n/d).
 * @author Georg Fischer
 */
public class A318366 extends DirichletConvolutionSequence {

  /** Construct the sequence. */
  public A318366() {
    super(new A001222(), 1);
  }
}
