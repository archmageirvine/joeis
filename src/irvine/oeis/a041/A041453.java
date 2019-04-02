package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041453 Denominators of continued fraction convergents to sqrt(242).
 * @author Sean A. Irvine
 */
public class A041453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041453() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 39202, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 7, 9, 133, 142, 559, 701, 1260, 38501, 39761, 78262, 274547, 352809, 5213873, 5566682, 21913919, 27480601, 49394520});
  }
}
