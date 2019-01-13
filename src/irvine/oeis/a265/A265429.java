package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265429.
 * @author Sean A. Irvine
 */
public class A265429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265429() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {1, 3, 5, 9, 13, 18});
  }
}
