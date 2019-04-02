package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200675 Powers of 2 repeated 4 times.
 * @author Sean A. Irvine
 */
public class A200675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200675() {
    super(new long[] {2, 0, 0, 0}, new long[] {1, 1, 1, 1});
  }
}
