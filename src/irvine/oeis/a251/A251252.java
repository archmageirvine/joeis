package irvine.oeis.a251;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A251252 Number of (n+1) X (2+1) 0..1 arrays with every 2 X 2 subblock having a single 1 or two 1s on the same edge.
 * @author Georg Fischer
 */
public class A251252 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A251252() {
    super(1, "[0,18,2,-90,24,24]", "[1,-3,-4,14,-3,-3]");
  }
}
