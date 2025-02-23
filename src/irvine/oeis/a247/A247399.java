package irvine.oeis.a247;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A247399 Number of length n+4 0..3 arrays with no disjoint pairs in any consecutive five terms having the same sum.
 * @author Georg Fischer
 */
public class A247399 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A247399() {
    super(1, "[0,200,264,340,428,528,-560,-720,-904,-1112,-1344]", "[1,0,0,0,0,-6,0,0,0,0,8]");
  }
}
