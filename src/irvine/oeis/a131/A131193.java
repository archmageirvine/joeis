package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131193 Period 6: repeat [0, 1, -3, 3, -1, 0].
 * @author Sean A. Irvine
 */
public class A131193 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131193() {
    super(new long[] {-1, -1, -1, -1, -1}, new long[] {0, 1, -3, 3, -1});
  }
}
