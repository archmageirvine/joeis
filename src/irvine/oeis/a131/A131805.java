package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131805.
 * @author Sean A. Irvine
 */
public class A131805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131805() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, -1, 1, 0, 4});
  }
}
