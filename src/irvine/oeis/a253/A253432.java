package irvine.oeis.a253;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A253432 Number of (n+1) X (5+1) 0..1 arrays with every 2 X 2 subblock diagonal minus antidiagonal sum nondecreasing horizontally, vertically and ne-to-sw antidiagonally.
 * @author Georg Fischer
 */
public class A253432 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A253432() {
    super(1, "[0,181,-369,32]", "[1,-3,2]");
  }
}
