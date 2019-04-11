package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272358 <code>a(n) = n*(945*n^4 - 3150*n^3 + 4095*n^2 - 2370*n + 496)</code>.
 * @author Sean A. Irvine
 */
public class A272358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272358() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 16, 4112, 65208, 387424, 1439480});
  }
}
