package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132337.
 * @author Sean A. Irvine
 */
public class A132337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132337() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 5});
  }
}
