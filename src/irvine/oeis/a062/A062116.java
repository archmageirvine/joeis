package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062116 <code>a(n) = 2^n mod 17</code>.
 * @author Sean A. Irvine
 */
public class A062116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062116() {
    super(new long[] {1, -1, 0, 0, 1}, new long[] {1, 2, 4, 8, 16});
  }
}
