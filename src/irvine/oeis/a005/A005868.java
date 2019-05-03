package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005868 Molien series for 3-dimensional representation of <code>Z2 X (double</code> cover of <code>A6)</code>, u.g.g.r. <code># 27</code> of Shephard and Todd.
 * @author Sean A. Irvine
 */
public class A005868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005868() {
    super(new long[] {1, 0, -1, 0, -1, -1, 1, 1, 0, 1, 0}, new long[] {1, 0, 1, 0, 2, 0, 2, 0, 3, 0, 4});
  }
}

