package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195036.
 * @author Sean A. Irvine
 */
public class A195036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195036() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 15, 23, 53, 69});
  }
}
