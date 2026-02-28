package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099177 a(n) = 2*a(n-1) + 4*a(n-2) - 4*a(n-3) - 4*a(n-4).
 * @author Sean A. Irvine
 */
public class A099177 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099177() {
    super(new long[] {-4, -4, 4, 2}, new long[] {0, 1, 2, 8});
  }
}
