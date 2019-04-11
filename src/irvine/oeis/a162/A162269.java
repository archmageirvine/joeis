package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162269 <code>a(n) = ((5+sqrt(2))*(2+sqrt(2))^n + (5-sqrt(2))*(2-sqrt(2))^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A162269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162269() {
    super(new long[] {-2, 4}, new long[] {5, 12});
  }
}
