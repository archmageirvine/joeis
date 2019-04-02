package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157366 a(n) = 686*n + 14.
 * @author Sean A. Irvine
 */
public class A157366 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157366() {
    super(new long[] {-1, 2}, new long[] {700, 1386});
  }
}
