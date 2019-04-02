package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084378 a(n) = n^3 + 3.
 * @author Sean A. Irvine
 */
public class A084378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084378() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 4, 11, 30});
  }
}
