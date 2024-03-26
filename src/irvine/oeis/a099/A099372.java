package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099372 a(n) = A099371(n)^2.
 * @author Sean A. Irvine
 */
public class A099372 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099372() {
    super(new long[] {-1, 82, 82}, new long[] {0, 1, 81});
  }
}
