package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195015.
 * @author Sean A. Irvine
 */
public class A195015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195015() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 2, 12, 24});
  }
}
