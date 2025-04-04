package irvine.oeis.a208;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A208035 Number of n X 4 0..1 arrays avoiding 0 0 0 and 0 1 0 horizontally and 0 0 0 and 1 0 1 vertically.
 * @author Georg Fischer
 */
public class A208035 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A208035() {
    super(1, "[0,9,63,100,86,-17,-9,-16]", "[1,-2,-3,-6,1,0,1]");
  }
}
