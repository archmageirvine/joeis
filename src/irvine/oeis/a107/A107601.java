package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107601 Column 6 of array illustrated in <code>A089574</code> and related to <code>A034261</code>.
 * @author Sean A. Irvine
 */
public class A107601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107601() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {7, 71, 350, 1204, 3329, 7936, 16981, 33452});
  }
}
