package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195824.
 * @author Sean A. Irvine
 */
public class A195824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195824() {
    super(new long[] {1, -3, 3}, new long[] {0, 24, 96});
  }
}
