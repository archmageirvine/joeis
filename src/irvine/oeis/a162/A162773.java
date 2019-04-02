package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162773 a(n) = ((2+sqrt(5))*(5+sqrt(5))^n + (2-sqrt(5))*(5-sqrt(5))^n)/2.
 * @author Sean A. Irvine
 */
public class A162773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162773() {
    super(new long[] {-20, 10}, new long[] {2, 15});
  }
}
