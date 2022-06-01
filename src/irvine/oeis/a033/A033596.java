package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033596 a(n) = (n^2 - 1)*(n^2 - 3).
 * @author Sean A. Irvine
 */
public class A033596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033596() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {3, 0, 3, 48, 195});
  }
}
