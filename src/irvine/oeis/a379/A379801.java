package irvine.oeis.a379;
// Generated by gen_seq4.pl 2025-01-31.ack/lambdan at 2025-01-31 23:19

import irvine.math.cr.CR;
import irvine.oeis.LambdaSequence;

/**
 * A379801 Nearest integer to n*(1+sqrt(6))/2.
 * @author Georg Fischer
 */
public class A379801 extends LambdaSequence {

  /** Construct the sequence. */
  public A379801() {
    super(0, n -> CR.SIX.sqrt().add(1).multiply(n).divide(2).round());
  }
}
