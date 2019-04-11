package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290718 <code>a(n) = 2^(n + 1) + 4^(n - 1) - 2</code>.
 * @author Sean A. Irvine
 */
public class A290718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290718() {
    super(new long[] {8, -14, 7}, new long[] {3, 10, 30});
  }
}
