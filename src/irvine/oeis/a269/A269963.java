package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269963 Start with a square; at each stage add a square at each expandable vertex so that the ratio between the side of the squares at stage n+1 and at stage n is the golden ratio phi=0.618...; a(n) is the number of squares in a portion of the n-th stage (see below).
 * @author Sean A. Irvine
 */
public class A269963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269963() {
    super(new long[] {2, 2, -2, 1, 2}, new long[] {1, 2, 7, 16, 37});
  }
}
