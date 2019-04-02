package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051878 Partial sums of A051797.
 * @author Sean A. Irvine
 */
public class A051878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051878() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 13, 63, 203, 518, 1134});
  }
}
