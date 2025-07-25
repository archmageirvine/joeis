package irvine.oeis.a351;
// Generated by gen_seq4.pl 2025-06-16.ack/lambdan at 2025-06-16 21:55

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a010.A010055;
import irvine.oeis.a324.A324886;

/**
 * A351956 a(n) = 1 if either n = 1 or the primorial inflation of n is equal to k * p#, where p# is the primorial (A034386) of some prime p, and 1 &lt;= k &lt; p, otherwise 0.
 * @author Georg Fischer
 */
public class A351956 extends LambdaSequence {

  private static final DirectSequence A010055 = new A010055();
  private static final DirectSequence A324886 = new A324886();

  /** Construct the sequence. */
  public A351956() {
    super(1, n -> A010055.a(A324886.a(n)));
  }
}
