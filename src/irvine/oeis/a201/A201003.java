package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201003 Triangular numbers, T(m), that are four-fifths of another triangular number: T(m) such that 5*T(m) = 4*T(k) for some k.
 * @author Sean A. Irvine
 */
public class A201003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201003() {
    super(new long[] {1, -323, 323}, new long[] {0, 36, 11628});
  }
}
