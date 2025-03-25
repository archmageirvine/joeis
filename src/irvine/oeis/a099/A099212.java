package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099212 a(n) = -2*a(n-1) + 4*a(n-3), with a(0) = 1, a(1) = a(2) = 0.
 * @author Sean A. Irvine
 */
public class A099212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099212() {
    super(new long[] {4, 0, -2}, new long[] {1, 0, 0});
  }
}
