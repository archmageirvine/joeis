package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195024.
 * @author Sean A. Irvine
 */
public class A195024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195024() {
    super(new long[] {1, -3, 3}, new long[] {0, 13, 54});
  }
}
