package irvine.oeis.a039;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A039823 a(n) = ceiling( (n^2 + n + 2)/4 ).
 * @author Sean A. Irvine
 */
public class A039823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A039823() {
    super(1, new long[] {1, -3, 4, -4, 3}, new long[] {1, 2, 4, 6, 8});
  }
}
