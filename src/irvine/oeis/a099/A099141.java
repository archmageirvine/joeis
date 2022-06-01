package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099141 a(n) = 5^n * T(n,7/5) where T is the Chebyshev polynomial of the first kind.
 * @author Sean A. Irvine
 */
public class A099141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099141() {
    super(new long[] {-25, 14}, new long[] {1, 7});
  }
}
