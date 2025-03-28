package irvine.oeis.a196;
// Generated by gen_seq4.pl 2024-12-28.ack/lingfcj at 2024-12-28 22:36

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A196423 Number of n X 1 0..4 arrays with each element equal to the number its horizontal and vertical neighbors less than itself.
 * @author Georg Fischer
 */
public class A196423 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A196423() {
    super(1, "[0,1,2,1]", "[1,-1,-1,-3,-1]");
  }
}
