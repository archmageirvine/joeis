package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116157 a(n) = a(n-1) + 2*a(n-2) - 2*a(n-3) + a(n-5).
 * @author Sean A. Irvine
 */
public class A116157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116157() {
    super(new long[] {1, 0, -2, 2, 1}, new long[] {1, 1, 3, 3, 7});
  }
}
