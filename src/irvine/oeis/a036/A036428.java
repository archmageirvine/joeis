package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036428.
 * @author Sean A. Irvine
 */
public class A036428 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036428() {
    super(new long[] {1, -195, 195}, new long[] {1, 225, 43681});
  }
}
