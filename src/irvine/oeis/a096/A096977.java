package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096977 <code>a(n) = 4*a(n-1) + 3*a(n-2) - 14*a(n-3) + 8*a(n-4)</code>.
 * @author Sean A. Irvine
 */
public class A096977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096977() {
    super(new long[] {8, -14, 3, 4}, new long[] {0, 1, 2, 11});
  }
}
