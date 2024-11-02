package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080860 a(n) = 10*n^2 + 5*n + 1.
 * @author Sean A. Irvine
 */
public class A080860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080860() {
    super(new long[] {1, -3, 3}, new long[] {1, 16, 51});
  }
}
