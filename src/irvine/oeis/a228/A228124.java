package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228124 Number of blocks in a Steiner Quadruple System of order <code>A047235(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A228124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228124() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 14, 30, 91, 140, 285, 385});
  }
}
