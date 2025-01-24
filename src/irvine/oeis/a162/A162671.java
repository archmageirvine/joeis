package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162671 For n even a(n) = a(n-1) + a(n-2), for n odd a(n) = 100*a(n-1) + a(n-2), with a(0) = 0, a(1) = 1.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A162671 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162671() {
    super(0, new long[] {-1, 0, 102, 0}, new long[] {0, 1, 1, 101});
  }
}
