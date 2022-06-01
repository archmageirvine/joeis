package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162562 a(n) = ((5+sqrt(3))*(1+sqrt(3))^n + (5-sqrt(3))*(1-sqrt(3))^n)/2.
 * @author Sean A. Irvine
 */
public class A162562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162562() {
    super(new long[] {2, 2}, new long[] {5, 8});
  }
}
