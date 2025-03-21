package irvine.oeis.a180;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A180374 1/120 the number of n X 3 arrays of integers in 1..6 with no element or any of its neighbors having the same value.
 * @author Georg Fischer
 */
public class A180374 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A180374() {
    super(1, "[0,1,15,12,-46]", "[1,-6,-18,32]");
  }
}
