package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262184.
 * @author Sean A. Irvine
 */
public class A262184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262184() {
    super(new long[] {-1, 2, 4, -6, -2, 4}, new long[] {1, 1, 1, 3, 7, 21});
  }
}
