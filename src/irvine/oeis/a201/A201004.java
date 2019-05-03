package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201004 Triangular numbers, <code>T(m)</code>, that are five-quarters of another triangular number; <code>T(m)</code> such that <code>4*T(m) = 5*T(k)</code> for some k.
 * @author Sean A. Irvine
 */
public class A201004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201004() {
    super(new long[] {1, -323, 323}, new long[] {0, 45, 14535});
  }
}
