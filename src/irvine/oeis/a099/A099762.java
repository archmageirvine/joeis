package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099762 a(n) = n^2 * (n+1)^3.
 * @author Sean A. Irvine
 */
public class A099762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099762() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 8, 108, 576, 2000, 5400});
  }
}
