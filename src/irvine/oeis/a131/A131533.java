package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131533.
 * @author Sean A. Irvine
 */
public class A131533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131533() {
    super(new long[] {-1, -1, -1, -1, -1}, new long[] {0, 0, 0, 0, 1});
  }
}
