package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160450.
 * @author Sean A. Irvine
 */
public class A160450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160450() {
    super(new long[] {-2304, 1728, -428, 39}, new long[] {1, 5, 43, 681});
  }
}
