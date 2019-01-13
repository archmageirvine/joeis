package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131193.
 * @author Sean A. Irvine
 */
public class A131193 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131193() {
    super(new long[] {-1, -1, -1, -1, -1}, new long[] {0, 1, -3, 3, -1});
  }
}
