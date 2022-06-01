package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092277 a(n) = 7*n^2 + n.
 * @author Sean A. Irvine
 */
public class A092277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092277() {
    super(new long[] {1, -3, 3}, new long[] {0, 8, 30});
  }
}
