package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116969 If n mod 2 = 0 then 3*2^(n-1)+n-1 else 3*2^(n-1)+n.
 * @author Sean A. Irvine
 */
public class A116969 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116969() {
    super(1, new long[] {2, -3, -1, 3}, new long[] {4, 7, 15, 27});
  }
}
