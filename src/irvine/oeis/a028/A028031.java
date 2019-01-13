package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028031.
 * @author Sean A. Irvine
 */
public class A028031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028031() {
    super(new long[] {-720, 624, -191, 24}, new long[] {1, 24, 385, 5280});
  }
}
