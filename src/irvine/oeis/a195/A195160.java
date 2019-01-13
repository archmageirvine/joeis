package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195160.
 * @author Sean A. Irvine
 */
public class A195160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195160() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 8, 11, 25});
  }
}
