package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176805 a(n) = 3^n + 3*n + 1.
 * @author Sean A. Irvine
 */
public class A176805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176805() {
    super(new long[] {3, -7, 5}, new long[] {2, 7, 16});
  }
}
