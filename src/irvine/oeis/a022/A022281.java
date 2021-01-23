package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022281 a(n) = n*(23*n + 1)/2.
 * @author Sean A. Irvine
 */
public class A022281 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022281() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 47});
  }
}
