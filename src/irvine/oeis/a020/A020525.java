package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020525 <code>a(n) = 5th</code> Euler polynomial evaluated at <code>2^n</code> and multiplied by 2.
 * @author Sean A. Irvine
 */
public class A020525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020525() {
    super(new long[] {-2048, 2752, -756, 53}, new long[] {1, 3, 847, 45375});
  }
}
