package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075907.
 * @author Sean A. Irvine
 */
public class A075907 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075907() {
    super(new long[] {-6144, 3200, -560, 40}, new long[] {1, 40, 1040, 22400});
  }
}
