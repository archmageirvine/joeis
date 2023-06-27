package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168522 a(n) = 98*a(n-1) - 2*a(n-2); a(1) = 0, a(2) = 1.
 * @author Sean A. Irvine
 */
public class A168522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168522() {
    super(1, new long[] {-2, 98}, new long[] {0, 1});
  }
}
