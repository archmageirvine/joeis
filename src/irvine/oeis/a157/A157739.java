package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157739 a(n) = 388962*n^2 - 1764*n + 1.
 * @author Sean A. Irvine
 */
public class A157739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157739() {
    super(new long[] {1, -3, 3}, new long[] {387199, 1552321, 3495367});
  }
}
