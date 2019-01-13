package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160838.
 * @author Sean A. Irvine
 */
public class A160838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160838() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 45, 557, 3473, 14417, 45965, 121997});
  }
}
