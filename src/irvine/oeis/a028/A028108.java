package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028108.
 * @author Sean A. Irvine
 */
public class A028108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028108() {
    super(new long[] {-3960, 2406, -461, 36}, new long[] {1, 36, 835, 15870});
  }
}
