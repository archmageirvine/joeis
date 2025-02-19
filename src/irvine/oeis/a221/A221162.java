package irvine.oeis.a221;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A221162 Number of n X 2 arrays of occupancy after each element stays put or moves to some horizontal, vertical or antidiagonal neighbor.
 * @author Georg Fischer
 */
public class A221162 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A221162() {
    super(1, "[0,3,-6,1]", "[1,-13,26,-1]");
  }
}
