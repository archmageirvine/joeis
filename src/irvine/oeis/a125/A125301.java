package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125301 <code>a(3n) =</code> n, <code>a(3n+1) = (n+2)*a(3n), a(3n+2) = (n+2)*a(3n+1)</code>.
 * @author Sean A. Irvine
 */
public class A125301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125301() {
    super(new long[] {-1, 0, 0, 4, 0, 0, -6, 0, 0, 4, 0, 0}, new long[] {0, 0, 0, 1, 3, 9, 2, 8, 32, 3, 15, 75});
  }
}
