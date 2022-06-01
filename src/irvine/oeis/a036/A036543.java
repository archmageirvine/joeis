package irvine.oeis.a036;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A036543 a(n) = T(3,n), array T given by A048471.
 * @author Sean A. Irvine
 */
public class A036543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036543() {
    super(new long[] {-3, 4}, new long[] {1, 9});
  }
}
