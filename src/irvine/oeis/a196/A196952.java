package irvine.oeis.a196;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A196952 Number of n X 3 0..4 arrays with each element x equal to the number its horizontal and vertical neighbors equal to 2,1,3,4,0 for x=0,1,2,3,4.
 * @author Georg Fischer
 */
public class A196952 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A196952() {
    super(1, "[0,3,6,5,1,-11,-12,2,6,2,-1]", "[1,-1,-4,-8,-10,-1,9,6,0,-1]");
  }
}
