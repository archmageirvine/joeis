package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083220 <code>a(n) = n + (n mod 4)</code>.
 * @author Sean A. Irvine
 */
public class A083220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083220() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 2, 4, 6, 4});
  }
}
