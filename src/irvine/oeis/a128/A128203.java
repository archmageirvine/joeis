package irvine.oeis.a128;
// Generated by gen_seq4.pl 2025-06-16.ack/lambdan at 2025-06-16 21:55

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a002.A002378;

/**
 * A128203 Sum of the digits of n*(n+1).
 * @author Georg Fischer
 */
public class A128203 extends LambdaSequence {

  private static final DirectSequence A002378 = new A002378();

  /** Construct the sequence. */
  public A128203() {
    super(0, n -> Functions.DIGIT_SUM.z(10, A002378.a(n)));
  }
}
