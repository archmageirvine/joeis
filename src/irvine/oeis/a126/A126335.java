package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126335 <code>a(n) = n*(4*n^2+5*n-3)/2</code>.
 * @author Sean A. Irvine
 */
public class A126335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126335() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 23, 72, 162});
  }
}
