package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016949.
 * @author Sean A. Irvine
 */
public class A016949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016949() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {243, 59049, 759375, 4084101, 14348907, 39135393});
  }
}
