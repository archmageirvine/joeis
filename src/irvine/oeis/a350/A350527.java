package irvine.oeis.a350;
// Generated by gen_seq4.pl 2025-03-07.ack/lambdan at 2025-03-07 21:14

import irvine.math.cr.CR;
import irvine.oeis.LambdaSequence;

/**
 * A350527 a(n) = c(n*r)*f(n/r), where f = floor, c = ceiling, and r = golden ratio (A001622).
 * @author Georg Fischer
 */
public class A350527 extends LambdaSequence {

  /** Construct the sequence. */
  public A350527() {
    super(1, n -> CR.PHI.multiply(n).ceil().multiply(CR.valueOf(n).divide(CR.PHI).floor()));
  }
}
