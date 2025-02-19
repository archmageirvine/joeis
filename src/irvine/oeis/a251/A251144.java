package irvine.oeis.a251;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A251144 Number of (n+1) X (3+1) 0..2 arrays with every 2 X 2 subblock summing to 4 and no 2 X 2 subblock having exactly two nonzero entries.
 * @author Georg Fischer
 */
public class A251144 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A251144() {
    super(1, "[0,53,-72,-118,83,74]", "[1,-3,0,5,-1,-2]");
  }
}
