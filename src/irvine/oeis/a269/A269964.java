package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269964 Start with a square; at each stage add a square at each expandable vertex so that the ratio between the side of the squares at stage <code>n+1</code> and at stage n is the golden ratio <code>phi=0.618...; a(n)</code> is the number of squares in a portion of the n-th stage <code>(see below)</code>.
 * @author Sean A. Irvine
 */
public class A269964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269964() {
    super(new long[] {-2, 0, 4, -3, -1, 3}, new long[] {1, 1, 3, 5, 11, 23});
  }
}
