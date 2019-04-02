package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186707 Partial sums of A007202 (crystal ball sequence for hexagonal close-packing).
 * @author Sean A. Irvine
 */
public class A186707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186707() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {1, 14, 71, 224, 547, 1134});
  }
}
