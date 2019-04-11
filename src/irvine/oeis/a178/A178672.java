package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178672 <code>a(n) = 6^n - 6</code>.
 * @author Sean A. Irvine
 */
public class A178672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178672() {
    super(new long[] {-6, 7}, new long[] {0, 30});
  }
}
