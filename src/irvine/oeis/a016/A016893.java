package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016893 (5n+3)^9.
 * @author Sean A. Irvine
 */
public class A016893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016893() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {19683, 134217728, 10604499373L, 198359290368L, 1801152661463L, 10578455953408L, 46411484401953L, 165216101262848L, 502592611936843L, 1352605460594688L});
  }
}
