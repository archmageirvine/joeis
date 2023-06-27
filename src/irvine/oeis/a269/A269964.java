package irvine.oeis.a269;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A269964 Start with a square; at each stage add a square at each expandable vertex so that the ratio of the side of the squares at stage n+1 and at stage n is the golden ratio phi=0.618...; a(n) is the number of squares in a portion of the n-th stage (see below).
 * @author Sean A. Irvine
 */
public class A269964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269964() {
    super(1, new long[] {-2, 0, 4, -3, -1, 3}, new long[] {1, 1, 3, 5, 11, 23});
  }
}
