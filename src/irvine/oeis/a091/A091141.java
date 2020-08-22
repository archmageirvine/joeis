package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091141 a(n) = 2*a(n-1) + 4*a(n-2) - 2*a(n-3) with initial terms 1, 4, 13.
 * @author Sean A. Irvine
 */
public class A091141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091141() {
    super(new long[] {-2, 4, 2}, new long[] {1, 4, 13});
  }
}
