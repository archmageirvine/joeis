package irvine.oeis.a237;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A237632 Number of (n+1) X (3+1) 0..2 arrays with the upper median of every 2 X 2 subblock differing from its horizontal and vertical neighbors by exactly one.
 * @author Georg Fischer
 */
public class A237632 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A237632() {
    super(1, "[0,702,1220,1310,1488,-722,-1980,-1108,-232,-96,-96,18,48,32]", "[1,0,0,0,-4]");
  }
}
