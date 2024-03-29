package irvine.oeis.a054;
// Generated by gen_seq4.pl dirichcop2 at 2021-04-24 00:16
// DO NOT EDIT here!

import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000010;
import irvine.oeis.a000.A000400;

/**
 * A054613 a(n) = Sum_{d|n} phi(d)*6^(n/d).
 * @author Georg Fischer
 */
public class A054613 extends PrependSequence {

  /** Construct the sequence. */
  public A054613() {
    super(new DirichletConvolutionSequence(new A000010(), 1, new A000400(), 0), 0);
  }
}
