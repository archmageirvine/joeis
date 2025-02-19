package irvine.oeis.a243;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A243636 Number of length n+2 0..5 arrays with no three unequal elements in a row and new values 0..5 introduced in 0..5 order.
 * @author Georg Fischer
 */
public class A243636 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A243636() {
    super(1, "[0,4,-27,40,59,-126,-51,80,32]", "[1,-9,25,-7,-64,54,48,-32,-16]");
  }
}
