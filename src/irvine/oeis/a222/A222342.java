package irvine.oeis.a222;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A222342 Number of (n+5) X 1 arrays of occupancy after each element moves up to +-5 places including 0.
 * @author Georg Fischer
 */
public class A222342 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A222342() {
    super(1, "[0,462,-3368,8341,-8095,2611,-126]", "[1,-11,45,-84,70,-21,1]");
  }
}
