package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174339 a(n) = 109*n^2.
 * @author Sean A. Irvine
 */
public class A174339 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174339() {
    super(new long[] {1, -3, 3}, new long[] {0, 109, 436});
  }
}
