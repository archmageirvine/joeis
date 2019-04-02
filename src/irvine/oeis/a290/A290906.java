package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290906 p-INVERT of the positive integers, where p(S) = 1 - 3*S^2.
 * @author Sean A. Irvine
 */
public class A290906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290906() {
    super(new long[] {-1, 4, -3, 4}, new long[] {0, 3, 12, 39});
  }
}
