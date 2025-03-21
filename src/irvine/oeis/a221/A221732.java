package irvine.oeis.a221;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A221732 Number of n X 3 arrays of occupancy after each element stays put or moves to some horizontal or antidiagonal neighbor, without move-in move-out left turns.
 * @author Georg Fischer
 */
public class A221732 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A221732() {
    super(1, "[0,8,8,32,-16]", "[1,-18,-17,-6,17]");
  }
}
