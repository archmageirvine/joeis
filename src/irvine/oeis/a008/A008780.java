package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008780 <code>(n-dimensional</code> partitions of <code>6) + C(n,4) + C(n,3)</code>.
 * @author Sean A. Irvine
 */
public class A008780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008780() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 11, 48, 141, 331, 672});
  }
}

