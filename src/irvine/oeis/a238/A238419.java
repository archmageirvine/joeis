package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238419 a(n) = the Wiener index of the Fibonacci cube G_n.
 * @author Sean A. Irvine
 */
public class A238419 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238419() {
    super(new long[] {-1, 4, 0, -10, 0, 4}, new long[] {0, 1, 4, 16, 54, 176});
  }
}
