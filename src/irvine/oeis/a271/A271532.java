package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271532 <code>a(n) = (-1)^n*(n + 1)*(5*n^2 + 10*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A271532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271532() {
    super(new long[] {-1, -4, -6, -4}, new long[] {1, -32, 123, -304});
  }
}
