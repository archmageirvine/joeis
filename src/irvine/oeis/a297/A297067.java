package irvine.oeis.a297;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A297067 Number of n X 2 0..1 arrays with no 1 adjacent to 1 king-move neighboring 1.
 * @author Georg Fischer
 */
public class A297067 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A297067() {
    super(1, "[0,3,-2,-5,-12,-8]", "[1,-4,1,1,4,8]");
  }
}
