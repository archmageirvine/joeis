package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131360.
 * @author Sean A. Irvine
 */
public class A131360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131360() {
    super(new long[] {-1, 1, -1, 1, 1, -1, 1}, new long[] {0, 0, 0, 1, 0, 0, 2});
  }
}
