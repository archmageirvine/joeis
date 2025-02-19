package irvine.oeis.a243;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A243635 Number of length n+2 0..4 arrays with no three unequal elements in a row and new values 0..4 introduced in 0..4 order.
 * @author Georg Fischer
 */
public class A243635 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A243635() {
    super(1, "[0,4,-19,14,30,-20,-12]", "[1,-7,14,0,-21,7,6]");
  }
}
