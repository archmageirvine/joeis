package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291392.
 * @author Sean A. Irvine
 */
public class A291392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291392() {
    super(new long[] {-36, -72, -24, 12}, new long[] {1, 10, 90, 765});
  }
}
