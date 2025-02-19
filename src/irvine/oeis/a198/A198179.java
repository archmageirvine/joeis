package irvine.oeis.a198;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A198179 Number of n X 2 0..4 arrays with each element x equal to the number its horizontal and vertical neighbors equal to 0,2,1,0,0 for x=0,1,2,3,4.
 * @author Georg Fischer
 */
public class A198179 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A198179() {
    super(1, "[0,0,4,3,-4,-1,-1,6,-3,-7]", "[1,0,-3,-2,2,2,0,-4,1,3]");
  }
}
