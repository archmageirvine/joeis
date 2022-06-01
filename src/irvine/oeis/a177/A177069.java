package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177069 11^n + n^11.
 * @author Sean A. Irvine
 */
public class A177069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177069() {
    super(new long[] {11, -133, 738, -2486, 5665, -9207, 10956, -9636, 6237, -2915, 946, -198, 23}, new long[] {1, 12, 2169, 178478, 4208945, 48989176, 364568617, 1996813914, 8804293473L, 33739007300L, 125937424601L, 570623341222L, 3881436747409L});
  }
}
