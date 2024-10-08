package irvine.oeis.a152;
// Generated by gen_seq4.pl 2024-09-12.ack/lambdan at 2024-09-12 20:55

import irvine.math.z.Integers;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a003.A003422;

/**
 * A152689 Apply partial sum operator thrice to factorials.
 * @author Georg Fischer
 */
public class A152689 extends LambdaSequence {

  private static final DirectSequence A003422 = new A003422();

  /** Construct the sequence. */
  public A152689() {
    super(0, n -> Integers.SINGLETON.sum(0, n - 1, j -> Integers.SINGLETON.sum(0, j - 1, m -> A003422.a(m))));
  }
}
