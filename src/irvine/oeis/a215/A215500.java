package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215500 <code>a(n) = ((sqrt(5) + 3)^n + (-sqrt(5) -1)^n + (-sqrt(5) + 3)^n + (sqrt(5) - 1)^n) / 2^n</code>.
 * @author Sean A. Irvine
 */
public class A215500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215500() {
    super(new long[] {1, -4, 3, 2}, new long[] {4, 2, 10, 14});
  }
}
