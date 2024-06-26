package irvine.oeis.a302;
// Generated by gen_seq4.pl 2024-06-23/lambdan at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a006.A006942;

/**
 * A302552 Number of segments needed to display the n-th prime number on a 7-segment LCD display.
 * @author Georg Fischer
 */
public class A302552 extends LambdaSequence {

  private static final DirectSequence A006942 = new A006942();

  /** Construct the sequence. */
  public A302552() {
    super(1, n -> A006942.a(Functions.PRIME.z(n)));
  }
}
