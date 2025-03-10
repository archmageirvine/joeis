package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133455 a(n) = 3*a(n-1) - 3*a(n-2) + 2*a(n-3), with a(0) = 4, a(1) = 2, a(2) = 1.
 * @author Sean A. Irvine
 */
public class A133455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133455() {
    super(new long[] {2, -3, 3}, new long[] {4, 2, 1});
  }
}
