package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098578.
 * @author Sean A. Irvine
 */
public class A098578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098578() {
    super(new long[] {-1, 1, 0, -1, 2}, new long[] {0, 1, 2, 3, 4});
  }
}
