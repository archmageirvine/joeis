package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257848 <code>a(n) = floor(n/8) * (n mod 8)</code>.
 * @author Sean A. Irvine
 */
public class A257848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257848() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7});
  }
}
