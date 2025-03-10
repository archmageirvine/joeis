package irvine.oeis.a214;
// Generated by gen_seq4.pl 2024-12-28.ack/lingfcj at 2024-12-28 22:36

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A214167 Number of 0..5 colorings of a 1 X (n+1) array circular in the n+1 direction with new values 0..5 introduced in row major order.
 * @author Georg Fischer
 */
public class A214167 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A214167() {
    super(1, "[0,1,-9,24,-19]", "[1,-10,30,-20,-31,30]");
  }
}
