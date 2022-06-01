package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155769 a(n) = 2n^2 + 2n - 41.
 * @author Sean A. Irvine
 */
public class A155769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155769() {
    super(new long[] {1, -3, 3}, new long[] {-41, -37, -29});
  }
}
