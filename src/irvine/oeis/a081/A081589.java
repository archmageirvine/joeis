package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081589.
 * @author Sean A. Irvine
 */
public class A081589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081589() {
    super(new long[] {1, -3, 3}, new long[] {1, 13, 61});
  }
}
