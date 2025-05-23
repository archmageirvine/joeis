package irvine.oeis.a127;
// Generated by gen_seq4.pl 2024-12-09.ack/lambdan at 2024-12-09 23:32

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a007.A007376;

/**
 * A127508 A007376(4n+2).
 * @author Georg Fischer
 */
public class A127508 extends LambdaSequence {

  private static final DirectSequence A007376 = new A007376();

  /** Construct the sequence. */
  public A127508() {
    super(0, n -> A007376.a(4 * n + 2));
  }
}
