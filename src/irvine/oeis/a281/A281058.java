package irvine.oeis.a281;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A281058 Number of 3 X n 0..1 arrays with no element equal to more than one of its horizontal and antidiagonal neighbors, with the exception of exactly two elements, and with new values introduced in order 0 sequentially upwards.
 * @author Georg Fischer
 */
public class A281058 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A281058() {
    super(1, "[0,0,6,38,-59,-89,62,-51,175,166,-217,-106,71,21,-7,-1]", "[1,-5,7,2,-10,2,5,-1,-1]");
  }
}
