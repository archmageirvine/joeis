package irvine.oeis.a340;
// Generated by gen_seq4.pl 2025-04-20.ack/lambdan at 2025-04-20 22:06

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a007.A007088;

/**
 * A340051 Mixed-radix representation of n where the least significant digit is in base 3 and other digits are in base 2.
 * @author Georg Fischer
 */
public class A340051 extends LambdaSequence {

  private static final DirectSequence A007088 = new A007088();

  /** Construct the sequence. */
  public A340051() {
    super(0, n -> A007088.a(n / 3).multiply(10).add(n % 3));
  }
}
