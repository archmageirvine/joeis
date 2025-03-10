package irvine.oeis.a214;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A214098 Number of 0..2 colorings on an n X 6 array circular in the 6 direction with new values 0..2 introduced in row major order.
 * @author Georg Fischer
 */
public class A214098 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A214098() {
    super(1, "[0,11,-66,105,-32]", "[1,-19,71,-86,24]");
  }
}
