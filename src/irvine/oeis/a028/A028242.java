package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028242 Follow n+1 by n. Also (essentially) Molien series of 2-dimensional quaternion group Q_8.
 * @author Sean A. Irvine
 */
public class A028242 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028242() {
    super(new long[] {-1, 1, 1}, new long[] {1, 0, 2});
  }
}
