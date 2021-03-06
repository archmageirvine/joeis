package irvine.oeis.a081;
// Generated by gen_seq4.pl dirichcon2 at 2021-04-24 00:16
// DO NOT EDIT here!

import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a000.A000010;
import irvine.oeis.a088.A088218;

/**
 * A081875 a(n) = Sum_{d|n} phi(n/d)*C(2*d,d)/2.
 * @author Georg Fischer
 */
public class A081875 extends DirichletConvolutionSequence {

  /** Construct the sequence. */
  public A081875() {
    super(new A000010(), 1, new A088218(), 0);
  }
}
