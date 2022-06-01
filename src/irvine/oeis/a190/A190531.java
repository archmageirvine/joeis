package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190531 Number of idempotents in Identity Difference Partial Transformation semigroup.
 * @author Sean A. Irvine
 */
public class A190531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190531() {
    super(new long[] {-36, 132, -193, 144, -58, 12}, new long[] {2, 5, 17, 57, 185, 593});
  }
}
