package irvine.oeis.a222;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A222591 Numerators of (n*(n - 3)/6) + 1, arising as the maximum possible number of triple lines for an n-element set.
 * @author Sean A. Irvine
 */
public class A222591 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222591() {
    super(3, new long[] {1, 0, 0, -3, 0, 0, 3, 0, 0}, new long[] {1, 5, 8, 4, 17, 23, 10, 38, 47});
  }
}
