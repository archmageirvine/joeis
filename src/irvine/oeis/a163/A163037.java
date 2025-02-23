package irvine.oeis.a163;
// Generated by gen_seq4.pl 2024-12-28.ack/lingfcj at 2024-12-28 22:36

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A163037 Number of nX2 binary arrays with all 1s connected and a path of 1s from left column to right column.
 * @author Georg Fischer
 */
public class A163037 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A163037() {
    super(1, "[0,1,2,1]", "[1,-5,8,-4,-1,1]");
  }
}
