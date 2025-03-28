package irvine.oeis.a196;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A196804 Number of n X 3 0..4 arrays with each element x equal to the number its horizontal and vertical neighbors equal to 4,2,3,0,1 for x=0,1,2,3,4.
 * @author Georg Fischer
 */
public class A196804 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A196804() {
    super(1, "[0,1,1,8,-4,-12,4]", "[1,-2,-2,-3,-17,-3,4]");
  }
}
