package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094161 Column 5 of A048790.
 * @author Sean A. Irvine
 */
public class A094161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094161() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {0, 5, 315, 2670, 10810});
  }
}
