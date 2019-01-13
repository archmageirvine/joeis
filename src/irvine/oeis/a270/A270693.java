package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270693.
 * @author Sean A. Irvine
 */
public class A270693 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270693() {
    super(new long[] {1, 2, 0, -2}, new long[] {1, -25, 51, -100});
  }
}
