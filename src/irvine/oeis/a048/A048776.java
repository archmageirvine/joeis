package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048776 First partial sums of A048739; second partial sums of A000129.
 * @author Sean A. Irvine
 */
public class A048776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048776() {
    super(new long[] {1, 0, -4, 4}, new long[] {1, 4, 12, 32});
  }
}
