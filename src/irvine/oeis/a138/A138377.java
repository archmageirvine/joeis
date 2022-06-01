package irvine.oeis.a138;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A138377 a(0) = 0, a(1) = 1, a(2) = 3, a(3) = 2; thereafter a(n) = -4*a(n-4).
 * @author Sean A. Irvine
 */
public class A138377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138377() {
    super(new long[] {-4, 0, 0, 0}, new long[] {0, 1, 3, 2});
  }
}
