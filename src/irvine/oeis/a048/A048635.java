package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048635 Number of rational points of Klein curve over GF(2^n).
 * @author Sean A. Irvine
 */
public class A048635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048635() {
    super(1, new long[] {-4, 8, -7, 4}, new long[] {0, 14, 24, 14});
  }
}
