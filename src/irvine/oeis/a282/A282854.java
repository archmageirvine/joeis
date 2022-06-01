package irvine.oeis.a282;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A282854 34-gonal numbers: a(n) = n*(32*n-30)/2.
 * @author Sean A. Irvine
 */
public class A282854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282854() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 34});
  }
}
