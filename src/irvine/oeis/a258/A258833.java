package irvine.oeis.a258;
// Generated by gen_seq4.pl 2025-03-02.ack/lambdan at 2025-03-02 23:03

import irvine.math.cr.CR;
import irvine.oeis.LambdaSequence;

/**
 * A258833 Nonhomogeneous Beatty sequence: ceiling((n + 1/4)*sqrt(2)).
 * @author Georg Fischer
 */
public class A258833 extends LambdaSequence {

  /** Construct the sequence. */
  public A258833() {
    super(0, n -> CR.valueOf(n).add(CR.ONE.divide(4)).multiply(CR.SQRT2).ceil());
  }
}
