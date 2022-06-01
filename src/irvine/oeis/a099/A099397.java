package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099397 Chebyshev polynomial of the first kind, T(n,x), evaluated at x=51.
 * @author Sean A. Irvine
 */
public class A099397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099397() {
    super(new long[] {-1, 102}, new long[] {1, 51});
  }
}
