package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198392 a(n) = (6*n*(3*n+7)+(2*n+13)*(-1)^n+3)/16 + 1.
 * @author Sean A. Irvine
 */
public class A198392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198392() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {2, 4, 12, 18, 31});
  }
}
