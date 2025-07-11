package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-07-01.ack/lambdan at 2025-07-01 16:42

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a371.A371242;

/**
 * A385048 The sum of the unitary divisors of n that are cubefull numbers (A036966).
 * @author Georg Fischer
 */
public class A385048 extends LambdaSequence {

  private static final DirectSequence A371242 = new A371242();

  /** Construct the sequence. */
  public A385048() {
    super(1, n -> Functions.USIGMA1.z(n).divide(A371242.a(n)));
  }
}
