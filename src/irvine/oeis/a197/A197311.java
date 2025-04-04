package irvine.oeis.a197;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A197311 Number of n X 2 0..4 arrays with each element x equal to the number its horizontal and vertical neighbors equal to 0,1,1,0,0 for x=0,1,2,3,4.
 * @author Georg Fischer
 */
public class A197311 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A197311() {
    super(1, "[0,1,-1,-3,5,-2,-7,6]", "[1,-1,-6,6,9,-10,0,3]");
  }
}
