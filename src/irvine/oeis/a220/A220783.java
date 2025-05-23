package irvine.oeis.a220;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A220783 Agreement numbers: number of n X 2 arrays of the count of horizontal and vertical neighbors equal to the corresponding element in a random 0..3 n X 2 array.
 * @author Georg Fischer
 */
public class A220783 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A220783() {
    super(1, "[0,2,1,-1]", "[1,-5,-6,4]");
  }
}
