package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271391.
 * @author Sean A. Irvine
 */
public class A271391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271391() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {1, 1, 5, 9, 13, 25});
  }
}
