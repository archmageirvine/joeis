package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152725 <code>a(n) = n*(n+1)*(n^4 + 2*n^3 - 2*n^2 - 3*n + 3)/2</code>.
 * @author Sean A. Irvine
 */
public class A152725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152725() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 63, 666, 3430, 12195, 34461});
  }
}
