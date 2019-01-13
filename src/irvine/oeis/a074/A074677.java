package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074677.
 * @author Sean A. Irvine
 */
public class A074677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074677() {
    super(new long[] {1, 1, 0, 1}, new long[] {0, 1, 1, 1});
  }
}
