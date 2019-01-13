package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200993.
 * @author Sean A. Irvine
 */
public class A200993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200993() {
    super(new long[] {1, -99, 99}, new long[] {0, 10, 990});
  }
}
