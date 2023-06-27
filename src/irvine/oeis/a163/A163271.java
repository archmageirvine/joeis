package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163271 Numerators of fractions in a 'zero-transform' approximation of sqrt(2) by means of a(n) = (a(n-1) + c)/(a(n-1) + 1) with c=2 and a(1)=0.
 * @author Sean A. Irvine
 */
public class A163271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163271() {
    super(1, new long[] {1, 2}, new long[] {0, 2});
  }
}
