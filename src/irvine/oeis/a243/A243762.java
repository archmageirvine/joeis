package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243762.
 * @author Sean A. Irvine
 */
public class A243762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243762() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 5, 9, 37});
  }
}
