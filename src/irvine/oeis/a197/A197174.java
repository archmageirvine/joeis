package irvine.oeis.a197;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A197174 Number of n X 2 0..4 arrays with each element x equal to the number its horizontal and vertical neighbors equal to 2,2,1,0,0 for x=0,1,2,3,4.
 * @author Georg Fischer
 */
public class A197174 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A197174() {
    super(1, "[0,1,3,-1,-4,-7,-6,3,3]", "[1,-2,-1,-2,1,4,2,-1,-1]");
  }
}
