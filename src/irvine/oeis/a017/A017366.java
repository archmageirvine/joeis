package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017366 a(n) = (10*n+8)^2.
 * @author Sean A. Irvine
 */
public class A017366 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017366() {
    super(new long[] {1, -3, 3}, new long[] {64, 324, 784});
  }
}
