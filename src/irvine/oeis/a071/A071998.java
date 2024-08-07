package irvine.oeis.a071;
// Generated by gen_seq4.pl 2024-07-05/lambdan at 2024-07-05 23:59

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a007.A007088;

/**
 * A071998 Write n in binary, interpret that as a decimal number, convert back to binary.
 * @author Georg Fischer
 */
public class A071998 extends LambdaSequence {

  private static final DirectSequence A007088 = new A007088();

  /** Construct the sequence. */
  public A071998() {
    super(0, n -> A007088.a(A007088.a(n)));
  }
}
