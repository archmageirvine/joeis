package irvine.oeis.a245;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A245945 Number of length n+3 0..2 arrays with some pair in every consecutive four terms totalling exactly 2.
 * @author Georg Fischer
 */
public class A245945 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A245945() {
    super(1, "[0,71,55,9,-54,-73,-57,-15,36,27]", "[1,-2,-2,-1,1,2,2,1,-1,-1]");
  }
}
