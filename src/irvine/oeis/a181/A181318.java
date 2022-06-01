package irvine.oeis.a181;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A181318 a(n) = A060819(n)^2.
 * @author Sean A. Irvine
 */
public class A181318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181318() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {0, 1, 1, 9, 1, 25, 9, 49, 4, 81, 25, 121});
  }
}
