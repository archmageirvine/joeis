package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101382 a(n) = n*(n+1)*(2*n^3-n^2+2)^2/6.
 * @author Sean A. Irvine
 */
public class A101382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101382() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 3, 196, 4418, 43320, 257645, 1108828, 3810996, 11105328});
  }
}
