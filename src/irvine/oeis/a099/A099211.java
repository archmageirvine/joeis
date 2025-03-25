package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099211 a(n) = -2*a(n-1) + 4*a(n-3), with a(0) = 1, a(1) = -2, a(2) = 4.
 * @author Sean A. Irvine
 */
public class A099211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099211() {
    super(new long[] {4, 0, -2}, new long[] {1, -2, 4});
  }
}
