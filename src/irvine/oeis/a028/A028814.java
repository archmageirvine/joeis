package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028814.
 * @author Sean A. Irvine
 */
public class A028814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028814() {
    super(new long[] {-4, 13, -15, 7}, new long[] {1, 5, 20, 78});
  }
}
