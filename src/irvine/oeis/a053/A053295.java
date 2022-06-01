package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053295 Partial sums of A053739.
 * @author Sean A. Irvine
 */
public class A053295 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053295() {
    super(new long[] {1, -5, 8, 1, -20, 29, -20, 7}, new long[] {1, 7, 29, 92, 247, 591, 1300, 2683});
  }
}
