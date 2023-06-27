package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159679 a(n) are solutions of the 2 equations: 7*a(n) +1 = c(n)^2 and 9*a(n) +1 = b(n)^2.
 * @author Sean A. Irvine
 */
public class A159679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159679() {
    super(1, new long[] {1, -255, 255}, new long[] {0, 32, 8160});
  }
}
