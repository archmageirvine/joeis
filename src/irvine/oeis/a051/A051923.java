package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051923 Partial sums of A051836.
 * @author Sean A. Irvine
 */
public class A051923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051923() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 9, 42, 140, 378, 882, 1848});
  }
}
