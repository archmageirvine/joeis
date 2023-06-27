package irvine.oeis.a278;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A278313 Number of letters "I" in Roman numeral representation of n.
 * @author Sean A. Irvine
 */
public class A278313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278313() {
    super(1, new long[] {1, 0, 0, 0, 0}, new long[] {1, 2, 3, 1, 0});
  }
}
