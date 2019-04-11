package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049480 <code>a(n) = (2*n-1)*(n^2 -n +6)/6</code>.
 * @author Sean A. Irvine
 */
public class A049480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049480() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 4, 10, 21});
  }
}
