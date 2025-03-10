package irvine.oeis.a221;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A221891 Number of 2 X n arrays of occupancy after each element moves to some horizontal, diagonal or antidiagonal neighbor, without 2-loops or left turns.
 * @author Georg Fischer
 */
public class A221891 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A221891() {
    super(1, "[0,0,0,8,-3]", "[1,-5,2,-5,3]");
  }
}
