package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022274 a(n) = n*(17*n - 1)/2.
 * @author Sean A. Irvine
 */
public class A022274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022274() {
    super(new long[] {1, -3, 3}, new long[] {0, 8, 33});
  }
}
