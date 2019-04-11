package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163758 <code>a(n) = 9*n*(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A163758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163758() {
    super(new long[] {1, -3, 3}, new long[] {0, 18, 54});
  }
}
