package irvine.oeis.a140;
// Generated by gen_seq4.pl 2024-11-22.ack/lingf at 2024-11-22 22:47

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A140490 Trajectory of 1 under repeated application of the map: n -&gt; n + third-smallest number that does not divide n.
 * @author Georg Fischer
 */
public class A140490 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A140490() {
    super(1, "[0,1,4,4,5,5,4,4,5,6,5,4,4,4,2,1,-1,-1,2,1,0,-2,-1,1,2,1]", "[1,-1,0,0,0,0,0,0,0,0,0,0,-1,1]");
  }
}
