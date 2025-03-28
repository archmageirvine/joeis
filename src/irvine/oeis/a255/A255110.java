package irvine.oeis.a255;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A255110 Number of length n+3 0..2 arrays with at most one downstep in every n consecutive neighbor pairs.
 * @author Georg Fischer
 */
public class A255110 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A255110() {
    super(1, "[0,81,-270,360,-237,78,-11]", "[1,-6,15,-20,15,-6,1]");
  }
}
