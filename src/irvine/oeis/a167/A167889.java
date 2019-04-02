package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167889 a(n) = (-7*3^n+(-3)^n+6*4^n) / 42.
 * @author Sean A. Irvine
 */
public class A167889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167889() {
    super(new long[] {-36, 9, 4}, new long[] {0, 0, 1});
  }
}
