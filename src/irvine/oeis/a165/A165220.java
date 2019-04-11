package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165220 Numbers n such that <code>8*n+1</code> is a cube.
 * @author Sean A. Irvine
 */
public class A165220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165220() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 91, 614, 1953});
  }
}
