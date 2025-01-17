package irvine.oeis.a105;
// Generated by gen_seq4.pl 2024-12-20.ack/lambdan at 2024-12-20 14:00

import irvine.math.cr.CR;
import irvine.oeis.LambdaSequence;

/**
 * A105665 a(n) = abs(floor(n/cos(n))).
 * @author Georg Fischer
 */
public class A105665 extends LambdaSequence {

  /** Construct the sequence. */
  public A105665() {
    super(1, n -> CR.valueOf(n).divide(CR.valueOf(n).cos()).floor().abs());
  }
}
