package irvine.oeis.a281;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A281832 Number of n X 3 0..1 arrays with no element equal to more than four of its king-move neighbors and with new values introduced in order 0 sequentially upwards.
 * @author Georg Fischer
 */
public class A281832 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A281832() {
    super(1, "[0,4,11,-8,-37,-61,-57,-46,-24]", "[1,-5,-4,-6,23,25,15,28]");
  }
}
