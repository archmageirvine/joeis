package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157762.
 * @author Sean A. Irvine
 */
public class A157762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157762() {
    super(new long[] {1, -3, 3}, new long[] {10662963, 52387849, 125674659});
  }
}
