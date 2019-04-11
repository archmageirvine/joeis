package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062725 Write <code>0,1,2,3,4,...</code> in a triangular spiral, then <code>a(n)</code> is the sequence found by reading the terms along the line from 0 in the direction <code>0,7,..</code>.
 * @author Sean A. Irvine
 */
public class A062725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062725() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 23});
  }
}
