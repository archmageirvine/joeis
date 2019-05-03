package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050483 Partial sums of <code>A051947</code>.
 * @author Sean A. Irvine
 */
public class A050483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050483() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 11, 60, 228, 690, 1782, 4092, 8580});
  }
}
