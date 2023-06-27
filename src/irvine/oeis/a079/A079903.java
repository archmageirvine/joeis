package irvine.oeis.a079;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079903 a(n) = (9n^4 - 18n^3 + 18n^2 - 9n + 2)/2.
 * @author Sean A. Irvine
 */
public class A079903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079903() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {1, 28, 190, 703, 1891});
  }
}
