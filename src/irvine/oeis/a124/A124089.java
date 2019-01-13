package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124089.
 * @author Sean A. Irvine
 */
public class A124089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124089() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 6, 27, 83, 209, 461, 923});
  }
}
