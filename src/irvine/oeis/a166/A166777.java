package irvine.oeis.a166;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A166777 Number of nX2 1..4 arrays containing at least one of each value, all equal values connected, and rows considered as a single number in nondecreasing order.
 * @author Georg Fischer
 */
public class A166777 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A166777() {
    super(1, "[0,0,12,32,-73,45,-7,-1]", "[1,-7,21,-35,35,-21,7,-1]");
  }
}
