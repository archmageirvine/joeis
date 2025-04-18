package irvine.oeis.a214;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A214099 Number of 0..2 colorings on an n X 7 array circular in the 7 direction with new values 0..2 introduced in row major order.
 * @author Georg Fischer
 */
public class A214099 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A214099() {
    super(1, "[0,21,-56,28]", "[1,-18,36,-16]");
  }
}
