package irvine.oeis.a221;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A221673 Number of n X 2 arrays of occupancy after each element moves to some horizontal or vertical neighbor, without move-in move-out left turns.
 * @author Georg Fischer
 */
public class A221673 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A221673() {
    super(1, "[0,1,-2,1]", "[1,-7,9,5,-10,3]");
  }
}
