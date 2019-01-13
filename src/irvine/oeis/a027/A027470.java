package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027470.
 * @author Sean A. Irvine
 */
public class A027470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027470() {
    super(new long[] {1, -3, 3}, new long[] {225, 675, 1350});
  }
}
