package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022526 Nexus numbers <code>(n+1)^10-n^10</code>.
 * @author Sean A. Irvine
 */
public class A022526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022526() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 1023, 58025, 989527, 8717049, 50700551, 222009073, 791266575, 2413042577L, 6513215599L});
  }
}
