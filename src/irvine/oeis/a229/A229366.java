package irvine.oeis.a229;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A229366 Number of n X 2 0..2 arrays avoiding 11 horizontally, 22 vertically and 00 antidiagonally.
 * @author Georg Fischer
 */
public class A229366 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A229366() {
    super(1, "[0,8,22,4,-17,4]", "[1,-2,-13,-3,13,-4]");
  }
}
