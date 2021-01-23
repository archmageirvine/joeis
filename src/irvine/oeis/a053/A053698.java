package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053698 a(n) = n^3 + n^2 + n + 1.
 * @author Sean A. Irvine
 */
public class A053698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053698() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 4, 15, 40});
  }
}
