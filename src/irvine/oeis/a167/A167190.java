package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167190 a(n) = 1 + 85*n + 2232*n^2 + 15276*n^3.
 * @author Sean A. Irvine
 */
public class A167190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167190() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {17594, 131307, 432796, 1013717});
  }
}
