package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133448 a(n) = 3*a(n-1) - a(n-3) + 3*a(n-4).
 * @author Sean A. Irvine
 */
public class A133448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133448() {
    super(new long[] {3, -1, 0, 3}, new long[] {2, 5, 13, 40});
  }
}
