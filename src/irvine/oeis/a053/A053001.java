package irvine.oeis.a053;
// Generated by gen_seq4.pl 2024-06-23/lambdan at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a000.A000290;

/**
 * A053001 Largest prime &lt; n^2.
 * @author Georg Fischer
 */
public class A053001 extends LambdaSequence {

  private static final DirectSequence A000290 = new A000290();

  /** Construct the sequence. */
  public A053001() {
    super(2, n -> Functions.PREV_PRIME.z(A000290.a(n)));
  }
}
