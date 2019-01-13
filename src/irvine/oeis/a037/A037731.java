package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037731.
 * @author Sean A. Irvine
 */
public class A037731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037731() {
    super(new long[] {-5, 1, 0, 0, 5}, new long[] {2, 11, 55, 278, 1392});
  }
}
