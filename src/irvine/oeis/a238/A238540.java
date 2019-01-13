package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238540.
 * @author Sean A. Irvine
 */
public class A238540 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238540() {
    super(new long[] {-6561, 9072, -2622, 112}, new long[] {1, 70, 5299, 419020});
  }
}
