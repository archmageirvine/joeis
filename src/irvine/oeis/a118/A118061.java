package irvine.oeis.a118;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A118061 9800*n^2-5740*n-4059.
 * @author Sean A. Irvine
 */
public class A118061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118061() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 23661, 66921});
  }
}
