package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126392.
 * @author Sean A. Irvine
 */
public class A126392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126392() {
    super(new long[] {-1, 0, 4}, new long[] {1, 5, 19});
  }
}
