package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080859 a(n) = 6*n^2 + 4*n + 1.
 * @author Sean A. Irvine
 */
public class A080859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080859() {
    super(new long[] {1, -3, 3}, new long[] {1, 11, 33});
  }
}
