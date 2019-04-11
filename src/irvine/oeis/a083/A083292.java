package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083292 <code>a(n) = n*floor(n/10) + (n mod 10)</code>.
 * @author Sean A. Irvine
 */
public class A083292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083292() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 40});
  }
}
