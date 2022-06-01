package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099142 a(n) = 6^n * T(n, 4/3) where T is the Chebyshev polynomial of the first kind.
 * @author Sean A. Irvine
 */
public class A099142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099142() {
    super(new long[] {-36, 16}, new long[] {1, 8});
  }
}
