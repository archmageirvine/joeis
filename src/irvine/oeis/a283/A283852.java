package irvine.oeis.a283;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A283852 Number of n X 3 0..1 arrays with no 1 equal to more than three of its horizontal, diagonal and antidiagonal neighbors.
 * @author Georg Fischer
 */
public class A283852 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A283852() {
    super(1, "[0,8,5,-2,-56,-24,-4,72,-32]", "[1,-7,2,-19,50,2,48,-88,32]");
  }
}
