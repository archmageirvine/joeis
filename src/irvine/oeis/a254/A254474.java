package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254474 30-gonal numbers: a(n) = n*(14*n-13).
 * @author Sean A. Irvine
 */
public class A254474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254474() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 30});
  }
}
