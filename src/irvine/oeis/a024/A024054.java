package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024054.
 * @author Sean A. Irvine
 */
public class A024054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024054() {
    super(new long[] {5, -31, 81, -115, 95, -45, 11}, new long[] {1, 4, -7, -118, -399, 0, 7849});
  }
}
