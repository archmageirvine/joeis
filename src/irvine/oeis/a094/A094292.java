package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094292.
 * @author Sean A. Irvine
 */
public class A094292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094292() {
    super(new long[] {1, -2, -3, 4}, new long[] {0, 0, 1, 3});
  }
}
