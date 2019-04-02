package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116697 a(n) = -a(n-1) - a(n-3) + a(n-4).
 * @author Sean A. Irvine
 */
public class A116697 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116697() {
    super(new long[] {1, -1, 0, -1}, new long[] {1, 1, -2, 2});
  }
}
