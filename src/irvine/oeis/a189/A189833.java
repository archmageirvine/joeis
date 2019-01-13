package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189833.
 * @author Sean A. Irvine
 */
public class A189833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189833() {
    super(new long[] {1, -3, 3}, new long[] {8, 9, 12});
  }
}
