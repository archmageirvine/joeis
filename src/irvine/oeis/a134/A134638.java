package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134638 Row sums of triangle <code>A134637</code>.
 * @author Sean A. Irvine
 */
public class A134638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134638() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 8, 28, 76});
  }
}
