package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135916 (n^4 - 10*n^2 + 15*n - 6)/2.
 * @author Sean A. Irvine
 */
public class A135916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135916() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 15, 75, 222});
  }
}
