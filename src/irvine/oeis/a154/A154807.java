package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154807.
 * @author Sean A. Irvine
 */
public class A154807 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154807() {
    super(new long[] {-100000, 1, 100000}, new long[] {11111, 1111100000, 111110000011111L});
  }
}
