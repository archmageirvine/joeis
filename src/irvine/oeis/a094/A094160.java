package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094160 Column 4 of A048790.
 * @author Sean A. Irvine
 */
public class A094160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094160() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 4, 76, 344});
  }
}
