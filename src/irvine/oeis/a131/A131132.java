package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131132.
 * @author Sean A. Irvine
 */
public class A131132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131132() {
    super(new long[] {-1, -1, 1, 0, 0, 0, 1, 1}, new long[] {1, 1, 2, 3, 5, 8, 14, 22});
  }
}
