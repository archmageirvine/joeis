package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189050.
 * @author Sean A. Irvine
 */
public class A189050 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189050() {
    super(new long[] {1, 0, 2, 0}, new long[] {3, 1, 7, 3});
  }
}
