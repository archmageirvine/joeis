package irvine.oeis.a235;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A235432 Number of (n+1) X (1+1) 0..2 arrays with the difference between each 2 X 2 subblock maximum and minimum lexicographically nondecreasing rowwise and columnwise.
 * @author Georg Fischer
 */
public class A235432 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A235432() {
    super(1, "[0,81,-65,-596,-38,800,48,-216]", "[1,-8,1,64,14,-88,-8,24]");
  }
}
