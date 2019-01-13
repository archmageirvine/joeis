package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291232.
 * @author Sean A. Irvine
 */
public class A291232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291232() {
    super(new long[] {-1, -6, -7, 6}, new long[] {6, 27, 114, 459});
  }
}
