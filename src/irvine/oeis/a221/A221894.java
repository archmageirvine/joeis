package irvine.oeis.a221;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A221894 Number of n X 2 arrays of occupancy after each element stays put or moves to some horizontal, vertical or antidiagonal neighbor, without move-in move-out straight through or left turns.
 * @author Georg Fischer
 */
public class A221894 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A221894() {
    super(1, "[0,3,16,33,34,-2,-4,1]", "[1,-5,-26,-45,-34,2,4,-1]");
  }
}
