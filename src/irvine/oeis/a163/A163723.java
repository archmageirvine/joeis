package irvine.oeis.a163;
// Generated by gen_seq4.pl 2024-12-28.ack/lingfcj at 2024-12-28 22:36

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A163723 Number of nX2 binary arrays with all 1s connected, a path of 1s from left column to right column, and no 1 having more than two 1s adjacent.
 * @author Georg Fischer
 */
public class A163723 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A163723() {
    super(1, "[0,1,3,-2,-1,1]", "[1,-4,5,-1,-2,1]");
  }
}
