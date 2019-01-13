package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178828.
 * @author Sean A. Irvine
 */
public class A178828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178828() {
    super(new long[] {3, -7, 8, -8, 5}, new long[] {0, 0, 1, 5, 17});
  }
}
