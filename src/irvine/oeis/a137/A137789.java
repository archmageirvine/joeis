package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137789 a(n) = 7^n - 6^n - 5^n - 4^n - 3^n - 2^n.
 * @author Sean A. Irvine
 */
public class A137789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137789() {
    super(new long[] {-5040, 8028, -5104, 1665, -295, 27}, new long[] {127, 4607, 50479, 446783, 3622207, 28040447});
  }
}
