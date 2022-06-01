package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180354 a(n) = n^4 + 4*n.
 * @author Sean A. Irvine
 */
public class A180354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180354() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 5, 24, 93, 272});
  }
}
