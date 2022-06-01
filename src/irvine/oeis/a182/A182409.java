package irvine.oeis.a182;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A182409 Prime-generating polynomial: 4n^2 + 12n - 1583.
 * @author Sean A. Irvine
 */
public class A182409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182409() {
    super(new long[] {1, -3, 3}, new long[] {-1583, -1567, -1543});
  }
}
