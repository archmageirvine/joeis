package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067725.
 * @author Sean A. Irvine
 */
public class A067725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067725() {
    super(new long[] {1, -3, 3}, new long[] {0, 9, 24});
  }
}
