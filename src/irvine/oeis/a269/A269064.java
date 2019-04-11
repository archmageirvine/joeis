package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269064 At stage <code>1,</code> start with a unit equilateral triangle. At each successive stage add <code>3*(n-1)</code> new triangles around outside with vertex-to-vertex contacts. Sequence gives number of triangles at n-th stage.
 * @author Sean A. Irvine
 */
public class A269064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269064() {
    super(new long[] {-1, 2, 0, -2, 2, -2, 0, 2}, new long[] {0, 1, 4, 10, 26, 48, 87, 135});
  }
}
