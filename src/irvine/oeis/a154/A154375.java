package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154375 a(n) = 1250*n^2 + 100*n + 1.
 * @author Sean A. Irvine
 */
public class A154375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154375() {
    super(new long[] {1, -3, 3}, new long[] {1351, 5201, 11551});
  }
}
