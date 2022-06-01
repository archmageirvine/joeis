package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139274 a(n) = n*(8*n-1).
 * @author Sean A. Irvine
 */
public class A139274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139274() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 30});
  }
}
