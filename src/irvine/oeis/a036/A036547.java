package irvine.oeis.a036;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A036547 a(n) = T(6,n), array T given by A048471.
 * @author Sean A. Irvine
 */
public class A036547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036547() {
    super(new long[] {-3, 4}, new long[] {1, 65});
  }
}
