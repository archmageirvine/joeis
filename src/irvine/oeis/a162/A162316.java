package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162316 a(n) = 5n^2 + 20n + 1.
 * @author Sean A. Irvine
 */
public class A162316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162316() {
    super(new long[] {1, -3, 3}, new long[] {1, 26, 61});
  }
}
