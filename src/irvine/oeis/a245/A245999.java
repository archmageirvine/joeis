package irvine.oeis.a245;
// Generated by gen_seq4.pl 2024-12-28.ack/lingfcj at 2024-12-28 22:36

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A245999 Number of length 4+2 0..n arrays with no pair in any consecutive three terms totalling exactly n.
 * @author Georg Fischer
 */
public class A245999 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A245999() {
    super(1, "[0,2,20,316,1004,2872,3020,2996,948,342]", "[1,-3,-1,11,-6,-14,14,6,-11,1,3,-1]");
  }
}
