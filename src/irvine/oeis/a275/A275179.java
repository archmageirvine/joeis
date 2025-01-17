package irvine.oeis.a275;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A275179 Number of n X 4 0..2 arrays with no element equal to any value at offset (-2,-1) (-1,0) or (-1,1) and new values introduced in order 0..2.
 * @author Georg Fischer
 */
public class A275179 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A275179() {
    super(1, "[0,14,-48,-31,423,-951,787,311,-920,378,125,29,-32]", "[1,-8,28,-57,70,-47,12,1,2,-1]");
  }
}
