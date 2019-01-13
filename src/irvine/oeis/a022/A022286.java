package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022286.
 * @author Sean A. Irvine
 */
public class A022286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022286() {
    super(new long[] {1, -3, 3}, new long[] {0, 14, 57});
  }
}
