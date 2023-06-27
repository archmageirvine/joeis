package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128964 a(n) = (n^3-n)*6^n.
 * @author Sean A. Irvine
 */
public class A128964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128964() {
    super(1, new long[] {-1296, 864, -216, 24}, new long[] {0, 216, 5184, 77760});
  }
}
