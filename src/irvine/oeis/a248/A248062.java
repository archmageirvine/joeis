package irvine.oeis.a248;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A248062 Number of length n+5 0..2 arrays with some disjoint triples in each consecutive six terms having the same sum.
 * @author Georg Fischer
 */
public class A248062 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A248062() {
    super(1, "[0,333,180,280,428,640,932,-5340,-960,-1408,-2048,-2944,-4160,15552]", "[1,-1,0,0,0,0,-20,20,0,0,0,0,64,-64]");
  }
}
