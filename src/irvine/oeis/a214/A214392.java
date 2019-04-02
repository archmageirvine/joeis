package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214392 If n mod 4 = 0 then a(n) = n/4, otherwise a(n) = n.
 * @author Sean A. Irvine
 */
public class A214392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214392() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 1, 2, 3, 1, 5, 6, 7});
  }
}
