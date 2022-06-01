package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020525 a(n) = 5th Euler polynomial evaluated at 2^n and multiplied by 2.
 * @author Sean A. Irvine
 */
public class A020525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020525() {
    super(new long[] {-2048, 2752, -756, 53}, new long[] {1, 3, 847, 45375});
  }
}
