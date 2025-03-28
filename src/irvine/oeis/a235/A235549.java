package irvine.oeis.a235;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A235549 Number of (n+1) X (1+1) 0..1 arrays with the sum of each 2 X 2 subblock two extreme terms minus its two median terms lexicographically nondecreasing rowwise and columnwise.
 * @author Georg Fischer
 */
public class A235549 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A235549() {
    super(1, "[0,16,14,-36,-8,36]", "[1,-2,-4,8,4,-8]");
  }
}
