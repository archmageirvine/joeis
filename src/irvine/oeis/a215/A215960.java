package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215960 First differences of A016759.
 * @author Sean A. Irvine
 */
public class A215960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215960() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {2186, 75938, 745418, 3959426, 14704202, 43261346, 108110858});
  }
}
