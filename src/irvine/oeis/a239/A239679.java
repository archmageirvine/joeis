package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239679 Least number k <code>&gt; 0</code> such that <code>k*2^n+1</code> is a cube.
 * @author Sean A. Irvine
 */
public class A239679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239679() {
    super(new long[] {8, -14, 7}, new long[] {7, 13, 31});
  }
}
