package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254643 Third partial sums of ninth powers (A001017).
 * @author Sean A. Irvine
 */
public class A254643 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254643() {
    super(1, new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {1, 515, 21225, 324275, 2862790, 17714466, 85232910, 339635850, 1168343775, 3571356685L, 9906622271L, 25333920885L, 60457751900L});
  }
}
