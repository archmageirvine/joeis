package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192951.
 * @author Sean A. Irvine
 */
public class A192951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192951() {
    super(new long[] {1, -1, -2, 3}, new long[] {0, 1, 3, 9});
  }
}
