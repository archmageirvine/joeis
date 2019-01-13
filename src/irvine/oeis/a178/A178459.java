package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178459.
 * @author Sean A. Irvine
 */
public class A178459 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178459() {
    super(new long[] {2, -3, 1, 0, 0, -2, 3}, new long[] {0, 0, 0, 0, 1, 3, 7});
  }
}
