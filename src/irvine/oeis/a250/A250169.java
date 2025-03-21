package irvine.oeis.a250;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A250169 Number of length 4+1 0..n arrays with the sum of adjacent differences multiplied by some arrangement of +-1 equal to zero.
 * @author Georg Fischer
 */
public class A250169 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A250169() {
    super(1, "[0,16,103,285,611,854,1020,852,612,274,101,-1,1]", "[1,-1,-2,1,1,2,0,-2,-1,-1,2,1,-1]");
  }
}
