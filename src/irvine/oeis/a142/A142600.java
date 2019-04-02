package irvine.oeis.a142;

import irvine.oeis.LinearRecurrence;

/**
 * A142600 Third trisection of A061037.
 * @author Sean A. Irvine
 */
public class A142600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142600() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {3, 45, 6, 165, 63, 357, 30, 621, 195, 957, 72, 1365});
  }
}
