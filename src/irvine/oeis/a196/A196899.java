package irvine.oeis.a196;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A196899 Number of n X 3 0..4 arrays with each element x equal to the number its horizontal and vertical neighbors equal to 4,3,1,0,2 for x=0,1,2,3,4.
 * @author Georg Fischer
 */
public class A196899 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A196899() {
    super(1, "[0,1,1,7,2,-18,-14,-17,11,7,-2]", "[1,-2,-7,-8,2,33,-2,6,14,-1,-2]");
  }
}
