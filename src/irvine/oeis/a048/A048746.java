package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048746 Partial sums of <code>A048655</code>.
 * @author Sean A. Irvine
 */
public class A048746 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048746() {
    super(new long[] {-1, -1, 3}, new long[] {1, 6, 17});
  }
}
