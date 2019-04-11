package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162270 <code>a(n) = ((5+sqrt(2))*(3+sqrt(2))^n + (5-sqrt(2))*(3-sqrt(2))^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A162270 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162270() {
    super(new long[] {-7, 6}, new long[] {5, 17});
  }
}
