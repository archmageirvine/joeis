package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269962 Start with a square; at each stage add a square at each expandable vertex so that the ratio between the side of the squares at stage <code>n+1</code> and at stage n is the golden ratio <code>phi=0.618...; a(n)</code> is the number of squares at n-th stage.
 * @author Sean A. Irvine
 */
public class A269962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269962() {
    super(new long[] {-2, 2, 2, -5, 4}, new long[] {1, 5, 17, 45, 105});
  }
}
