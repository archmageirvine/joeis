package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137531 <code>a(n) = 3*a(n-1) - 2*a(n-2) + a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A137531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137531() {
    super(new long[] {1, -2, 3}, new long[] {1, 4, 10});
  }
}
