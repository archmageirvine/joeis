package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164035 a(n) = ((4+3*sqrt(2))*(5+sqrt(2))^n + (4-3*sqrt(2))*(5-sqrt(2))^n)/4.
 * @author Sean A. Irvine
 */
public class A164035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164035() {
    super(new long[] {-23, 10}, new long[] {2, 13});
  }
}
