package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052459 <code>a(n) = n*(2*n^2+1)*(n^2+1)/6</code>.
 * @author Sean A. Irvine
 */
public class A052459 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052459() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 15, 95, 374, 1105, 2701});
  }
}
