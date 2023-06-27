package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133648 a(n) = 2*3^n + 3^(n-1) - (n+1).
 * @author Sean A. Irvine
 */
public class A133648 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133648() {
    super(1, new long[] {3, -7, 5}, new long[] {5, 18, 59});
  }
}
