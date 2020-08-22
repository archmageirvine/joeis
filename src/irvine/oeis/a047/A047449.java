package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047449 Numbers that are primitively represented by x^2 + y^2 + z^2.
 * @author Sean A. Irvine
 */
public class A047449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047449() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 2, 3, 5, 6, 9});
  }
}
