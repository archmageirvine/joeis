package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081266 Staggered diagonal of triangular spiral in A051682.
 * @author Sean A. Irvine
 */
public class A081266 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081266() {
    super(new long[] {1, -3, 3}, new long[] {0, 6, 21});
  }
}
