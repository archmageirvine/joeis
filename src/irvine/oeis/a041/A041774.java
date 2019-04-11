package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041774 Numerators of continued fraction convergents to <code>sqrt(408)</code>.
 * @author Sean A. Irvine
 */
public class A041774 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041774() {
    super(new long[] {-1, 0, 202, 0}, new long[] {20, 101, 4060, 20401});
  }
}
