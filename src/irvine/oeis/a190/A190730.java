package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190730.
 * @author Sean A. Irvine
 */
public class A190730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190730() {
    super(new long[] {-4, 12, -13, 6}, new long[] {3, 16, 53, 146});
  }
}
