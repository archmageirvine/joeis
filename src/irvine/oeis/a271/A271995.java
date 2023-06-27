package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271995 The Pnictogen sequence: a(n) = A018227(n)-3.
 * @author Sean A. Irvine
 */
public class A271995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271995() {
    super(2, new long[] {-1, 2, 1, -4, 1, 2}, new long[] {7, 15, 33, 51, 83, 115});
  }
}
