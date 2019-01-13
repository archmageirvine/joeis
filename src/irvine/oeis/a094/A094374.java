package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094374.
 * @author Sean A. Irvine
 */
public class A094374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094374() {
    super(new long[] {6, -11, 6}, new long[] {1, 3, 8});
  }
}
