package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152995 Twice 11-gonal numbers: <code>a(n) = n*(9*n-7)</code>.
 * @author Sean A. Irvine
 */
public class A152995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152995() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 22});
  }
}
