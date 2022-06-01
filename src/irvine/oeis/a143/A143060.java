package irvine.oeis.a143;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A143060 A007318 * [1, 15, 65, 90, 31, 1, 0, 0, 0, ...].
 * @author Sean A. Irvine
 */
public class A143060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143060() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 16, 96, 331, 842, 1782});
  }
}
