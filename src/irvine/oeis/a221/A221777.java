package irvine.oeis.a221;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A221777 Number of n X 2 arrays of occupancy after each element stays put or moves to some horizontal, diagonal or antidiagonal neighbor, without move-in move-out left turns.
 * @author Georg Fischer
 */
public class A221777 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A221777() {
    super(1, "[0,3,1,-1,-1]", "[1,-8,5,-7,4,1]");
  }
}
