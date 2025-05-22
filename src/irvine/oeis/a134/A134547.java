package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134547 a(n) = 5*n^2 + 20*n + 4.
 * @author Sean A. Irvine
 */
public class A134547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134547() {
    super(1, new long[] {1, -3, 3}, new long[] {29, 64, 109});
  }
}
