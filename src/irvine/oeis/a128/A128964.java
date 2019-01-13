package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128964.
 * @author Sean A. Irvine
 */
public class A128964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128964() {
    super(new long[] {-1296, 864, -216, 24}, new long[] {0, 216, 5184, 77760});
  }
}
