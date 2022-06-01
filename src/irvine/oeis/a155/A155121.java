package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155121 a(n) = 2*n*(1 + n + n^2 + n^3) - 3.
 * @author Sean A. Irvine
 */
public class A155121 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155121() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {-3, 5, 57, 237, 677});
  }
}
