package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127215 a(n) = 3^n*tribonacci(n) or (3^n)*A001644(n+1).
 * @author Sean A. Irvine
 */
public class A127215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127215() {
    super(1, new long[] {27, 9, 3}, new long[] {3, 27, 189});
  }
}
