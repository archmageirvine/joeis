package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092277 <code>a(n) = 7*n^2 + n</code>.
 * @author Sean A. Irvine
 */
public class A092277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092277() {
    super(new long[] {1, -3, 3}, new long[] {0, 8, 30});
  }
}
