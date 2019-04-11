package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162563 <code>a(n) = ((5+sqrt(3))*(2+sqrt(3))^n + (5-sqrt(3))*(2-sqrt(3))^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A162563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162563() {
    super(new long[] {-1, 4}, new long[] {5, 13});
  }
}
