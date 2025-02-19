package irvine.oeis.a205;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A205314 Number of (n+1) X 5 0..1 arrays with every 2 X 2 subblock having the same number of equal edges, and new values 0..1 introduced in row major order.
 * @author Georg Fischer
 */
public class A205314 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A205314() {
    super(1, "[0,164,-1080,2400,-2320,976,-144]", "[1,-17,81,-157,140,-56,8]");
  }
}
