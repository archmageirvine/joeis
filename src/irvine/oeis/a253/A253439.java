package irvine.oeis.a253;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A253439 Number of (5+1) X (n+1) 0..1 arrays with every 2 X 2 subblock diagonal minus antidiagonal sum nondecreasing horizontally, vertically and ne-to-sw antidiagonally.
 * @author Georg Fischer
 */
public class A253439 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A253439() {
    super(1, "[0,181,-363,15,9,2]", "[1,-3,2]");
  }
}
