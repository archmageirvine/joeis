package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290908 p-INVERT of the positive integers, where <code>p(S) = 1 - 4*S^2</code>.
 * @author Sean A. Irvine
 */
public class A290908 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290908() {
    super(new long[] {-1, 4, -2, 4}, new long[] {0, 4, 16, 56});
  }
}
