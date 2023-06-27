package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051450 Number of positive rational knots with 2n+1 crossings.
 * @author Sean A. Irvine
 */
public class A051450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051450() {
    super(1, new long[] {1, -2, -3, 4}, new long[] {1, 2, 5, 12});
  }
}
