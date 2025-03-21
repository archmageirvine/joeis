package irvine.oeis.a218;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A218516 Number of n X 2 arrays of the minimum value of corresponding elements and their horizontal or antidiagonal neighbors in a random 0..3 n X 2 array.
 * @author Georg Fischer
 */
public class A218516 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A218516() {
    super(1, "[0,4,12,8,4,-2]", "[1,-6,-3,0,4,-1]");
  }
}
