package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177059 a(n) = 25*n^2 + 25*n + 6.
 * @author Sean A. Irvine
 */
public class A177059 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177059() {
    super(new long[] {1, -3, 3}, new long[] {6, 56, 156});
  }
}
