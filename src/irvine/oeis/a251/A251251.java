package irvine.oeis.a251;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A251251 Number of (n+1) X (1+1) 0..1 arrays with every 2 X 2 subblock having a single 1 or two 1s on the same edge.
 * @author Georg Fischer
 */
public class A251251 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A251251() {
    super(1, "[0,8,10,-4]", "[1,-1,-3,1]");
  }
}
