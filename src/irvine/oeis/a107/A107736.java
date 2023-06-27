package irvine.oeis.a107;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A107736 Pentagonal numbers that are half other pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A107736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107736() {
    super(1, new long[] {1, -1331715, 1331715}, new long[] {35, 46651605, 62126595542551L});
  }
}
