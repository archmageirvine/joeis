package irvine.oeis.a280;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A280118 Number of n X 2 0..2 arrays with no element unequal to a strict majority of its horizontal, vertical and antidiagonal neighbors, with the exception of exactly one element, and with new values introduced in order 0 sequentially upwards.
 * @author Georg Fischer
 */
public class A280118 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A280118() {
    super(1, "[0,0,4,0,-16,-32,-8,32,32]", "[1,-2,-7,0,24,32,16]");
  }
}
