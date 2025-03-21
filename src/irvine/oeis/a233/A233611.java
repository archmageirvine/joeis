package irvine.oeis.a233;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A233611 Number of (n+2) X (1+2) 0..2 arrays with no increasing sequence of length 3 horizontally or diagonally downwards.
 * @author Georg Fischer
 */
public class A233611 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A233611() {
    super(1, "[0,17064,-13056,-58240,32448]", "[1,-26,16,88,-48]");
  }
}
