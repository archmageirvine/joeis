package irvine.oeis.a226;
// manually 2020-11-16

import irvine.oeis.RecordPositionSequence;

/**
 * A226899 Numbers n for which Delta(m) &lt; Delta(n) for all m &lt; n, where Delta is Hooley's Delta function A226898.
 * @author Georg Fischer
 */
public class A226899 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A226899() {
    super(new A226898(), 1, false);
  }
}
