package irvine.oeis.a328;
// Generated by gen_seq4.pl dirichcon at 2021-04-24 00:16
// DO NOT EDIT here!

import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a001.A001227;

/**
 * A328486 Dirichlet g.f.: zeta(s)^4 * (1 - 2^(-s))^2.
 * @author Georg Fischer
 */
public class A328486 extends DirichletConvolutionSequence {

  /** Construct the sequence. */
  public A328486() {
    super(new A001227(), 1);
  }
}
