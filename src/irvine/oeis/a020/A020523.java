package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020523 a(n) = 3rd Euler polynomial evaluated at 2^n and multiplied by 4.
 * @author Sean A. Irvine
 */
public class A020523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020523() {
    super(new long[] {32, -44, 13}, new long[] {-1, 9, 161});
  }
}
