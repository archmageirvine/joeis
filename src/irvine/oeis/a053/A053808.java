package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053808 Partial sums of <code>A001891</code>.
 * @author Sean A. Irvine
 */
public class A053808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053808() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {1, 5, 15, 36, 76});
  }
}
