package irvine.oeis.a327;
// Generated by gen_seq4.pl dirichinv at 2021-04-20 22:30
// DO NOT EDIT here!

import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a000.A000593;

/**
 * A327278 a(n) = Sum_{d|n, d odd} d * mu(d) * mu(n/d).
 * @author Georg Fischer
 */
public class A327278 extends DirichletInverseSequence {

  /** Construct the sequence. */
  public A327278() {
    super(new A000593());
  }
}
