package irvine.oeis.a217;
// Generated by gen_seq4.pl 2024-12-28.ack/lingfcj at 2024-12-28 22:36

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A217639 Number of nX2 arrays of the minimum value of corresponding elements and their horizontal, vertical or antidiagonal neighbors in a random 0..2 nX2 array.
 * @author Georg Fischer
 */
public class A217639 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A217639() {
    super(1, "[0,3,3,0,1,-3,1]", "[1,-2,-3,-3,-2,0,1]");
  }
}
