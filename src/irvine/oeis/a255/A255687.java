package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255687 a(n) = n*(n + 1)*(7*n + 11)/6.
 * @author Sean A. Irvine
 */
public class A255687 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255687() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 6, 25, 64});
  }
}
