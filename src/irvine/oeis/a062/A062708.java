package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062708 Write <code>0,1,2,3,4,... in a</code> triangular spiral; then <code>a(n)</code> is the sequence found by reading the terms along the line from 0 in the direction <code>0,2,..</code>.
 * @author Sean A. Irvine
 */
public class A062708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062708() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 13});
  }
}
