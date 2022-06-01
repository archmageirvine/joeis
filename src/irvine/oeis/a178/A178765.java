package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178765 a(n) = 17*a(n-1) + a(n-2), with a(-1) = 0 and a(0) = 1.
 * @author Sean A. Irvine
 */
public class A178765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178765() {
    super(new long[] {1, 17}, new long[] {0, 1});
  }
}
