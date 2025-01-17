package irvine.oeis.a274;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A274954 Number of n X 3 0..2 arrays with no element equal to any value at offset (-1,-1) (-2,0) or (0,-2) and new values introduced in order 0..2.
 * @author Georg Fischer
 */
public class A274954 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A274954() {
    super(1, "[0,3,12,-6,12,3]", "[1,-4,0,-4,-1]");
  }
}
