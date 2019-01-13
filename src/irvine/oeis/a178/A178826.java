package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178826.
 * @author Sean A. Irvine
 */
public class A178826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178826() {
    super(new long[] {7, -8, 1, -7, 8}, new long[] {0, 5, 43, 309, 2176});
  }
}
