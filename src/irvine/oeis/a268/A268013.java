package irvine.oeis.a268;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A268013 Number of n X 1 0..2 arrays with every repeated value in every row and column greater than or equal to the previous repeated value.
 * @author Georg Fischer
 */
public class A268013 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A268013() {
    super(1, "[0,3,-9,0,9,6,1]", "[1,-6,9,4,-9,-6,-1]");
  }
}
