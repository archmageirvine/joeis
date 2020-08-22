package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017489 a(n) = (11*n + 8)^5.
 * @author Sean A. Irvine
 */
public class A017489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017489() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {32768, 2476099, 24300000, 115856201, 380204032, 992436543});
  }
}
