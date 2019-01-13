package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244498.
 * @author Sean A. Irvine
 */
public class A244498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244498() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 36, 446, 3172, 15891, 62408, 204828, 585672, 1501269, 3521452});
  }
}
