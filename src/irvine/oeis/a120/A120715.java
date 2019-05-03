package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120715 Sequence produced by <code>14 X 14</code> Markov chain based on 14-vertex graph formed from direct product of two copies of the graph used in <code>A120714</code>.
 * @author Sean A. Irvine
 */
public class A120715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120715() {
    super(new long[] {-17, -28, 228, 666, 419, -250, -263, -6, 30, 2}, new long[] {0, 27, 838, 4025, 29742, 161630, 962784, 5335471, 30120946, 166834881});
  }
}
