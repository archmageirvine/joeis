package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093566 <code>a(n) = n*(n-1)*(n-2)*(n-3)*(n^2-3*n-2)/48</code>.
 * @author Sean A. Irvine
 */
public class A093566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093566() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 0, 0, 1, 20, 120});
  }
}
