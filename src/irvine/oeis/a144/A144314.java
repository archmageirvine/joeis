package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144314 <code>a(n) = 3*n*(6*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A144314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144314() {
    super(new long[] {1, -3, 3}, new long[] {0, 21, 78});
  }
}
