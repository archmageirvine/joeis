package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064412 At stage <code>1,</code> start with a unit equilateral equiangular triangle. At each successive stage add <code>3*(n-1)</code> new triangles around outside with edge-to-edge contacts. Sequence gives number of triangles (regardless of size) at n-th stage.
 * @author Sean A. Irvine
 */
public class A064412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064412() {
    super(new long[] {-1, 2, 0, -2, 2, -2, 0, 2}, new long[] {1, 5, 14, 32, 60, 103, 160, 238});
  }
}
