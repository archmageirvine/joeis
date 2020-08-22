package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048492 a(n) = ( 8*(2^n) - n^2 - 3*n - 6 )/2.
 * @author Sean A. Irvine
 */
public class A048492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048492() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 3, 8, 20});
  }
}
