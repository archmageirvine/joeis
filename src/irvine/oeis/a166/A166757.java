package irvine.oeis.a166;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A166757 Number of nX2 1..4 arrays containing at least one of each value, and all equal values connected.
 * @author Georg Fischer
 */
public class A166757 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A166757() {
    super(1, "[0,0,24,336,648,312,192,24]", "[1,-7,21,-35,35,-21,7,-1]");
  }
}
