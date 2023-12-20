package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167176 a(n) = n^3 mod 9.
 * @author Sean A. Irvine
 */
public class A167176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167176() {
    super(new long[] {1, 0, 0}, new long[] {0, 1, 8});
  }
}
