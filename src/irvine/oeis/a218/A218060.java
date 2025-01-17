package irvine.oeis.a218;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A218060 Number of n X 4 arrays of the minimum value of corresponding elements and their horizontal or antidiagonal neighbors in a random 0..1 n X 4 array.
 * @author Georg Fischer
 */
public class A218060 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A218060() {
    super(1, "[0,6,-12,-10,44,-24,-6,4]", "[1,-9,18,-6,-7,2,1]");
  }
}
