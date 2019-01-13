package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269792.
 * @author Sean A. Irvine
 */
public class A269792 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269792() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 5, 80, 405, 1280});
  }
}
