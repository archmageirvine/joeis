package irvine.oeis.a183;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A183485 Number of n X 2 0..3 arrays with every element equal to either the sum mod 4 of its vertical neighbors or the sum mod 4 of its horizontal neighbors.
 * @author Georg Fischer
 */
public class A183485 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A183485() {
    super(1, "[0,4,12,-24,-48,-144,-144]", "[1,-4,0,-24,48,0,144]");
  }
}
