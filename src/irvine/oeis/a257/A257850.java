package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257850 <code>a(n) = floor(n/10) * (n mod 10)</code>.
 * @author Sean A. Irvine
 */
public class A257850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257850() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
  }
}
