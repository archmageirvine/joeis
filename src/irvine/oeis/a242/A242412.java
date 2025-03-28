package irvine.oeis.a242;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A242412 a(n) = (2*n-1)^2 + 14.
 * @author Sean A. Irvine
 */
public class A242412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242412() {
    super(1, new long[] {1, -3, 3}, new long[] {15, 23, 39});
  }
}
