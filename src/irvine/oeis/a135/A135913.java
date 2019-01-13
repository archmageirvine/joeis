package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135913.
 * @author Sean A. Irvine
 */
public class A135913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135913() {
    super(new long[] {6, -11, 6}, new long[] {5, 7, 9});
  }
}
