package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062394 <code>a(n) = 6^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A062394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062394() {
    super(new long[] {-6, 7}, new long[] {2, 7});
  }
}
