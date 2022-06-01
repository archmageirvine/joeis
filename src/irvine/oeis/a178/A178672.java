package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178672 a(n) = 6^n - 6.
 * @author Sean A. Irvine
 */
public class A178672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178672() {
    super(new long[] {-6, 7}, new long[] {0, 30});
  }
}
