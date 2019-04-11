package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074511 <code>a(n) = 1^n + 4^n + 5^n</code>.
 * @author Sean A. Irvine
 */
public class A074511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074511() {
    super(new long[] {20, -29, 10}, new long[] {3, 10, 42});
  }
}
