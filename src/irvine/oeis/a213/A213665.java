package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213665 Number of dominating subsets of the graph <code>G(n)</code> obtained by joining a vertex with two consecutive vertices of the cycle graph <code>C_n (n &gt;=3)</code>.
 * @author Sean A. Irvine
 */
public class A213665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213665() {
    super(new long[] {1, 1, 1}, new long[] {13, 23, 43});
  }
}
