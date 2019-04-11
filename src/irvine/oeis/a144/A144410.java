package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144410 <code>a(n) = 4*(3*n+1)*(3*n+2)</code>.
 * @author Sean A. Irvine
 */
public class A144410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144410() {
    super(new long[] {1, -3, 3}, new long[] {8, 80, 224});
  }
}
