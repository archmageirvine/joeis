package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195034.
 * @author Sean A. Irvine
 */
public class A195034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195034() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 21, 41, 83, 123});
  }
}
