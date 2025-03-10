package irvine.oeis.a283;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A283858 Number of 2 X n 0..1 arrays with no 1 equal to more than three of its horizontal, diagonal and antidiagonal neighbors.
 * @author Georg Fischer
 */
public class A283858 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A283858() {
    super(1, "[0,4,4,9,6]", "[1,-3,-1,-7,-6]");
  }
}
