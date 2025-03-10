package irvine.oeis.a196;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A196584 Number of n X 2 0..4 arrays with each element x equal to the number its horizontal and vertical neighbors equal to 3,2,0,1,4 for x=0,1,2,3,4.
 * @author Georg Fischer
 */
public class A196584 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A196584() {
    super(1, "[0,1,6,7,-1,-7,-3]", "[1,-1,-6,-4,3,1,2,1]");
  }
}
