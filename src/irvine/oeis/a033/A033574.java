package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033574 <code>(2n+1)(10n+1)</code>.
 * @author Sean A. Irvine
 */
public class A033574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033574() {
    super(new long[] {1, -3, 3}, new long[] {1, 33, 105});
  }
}
