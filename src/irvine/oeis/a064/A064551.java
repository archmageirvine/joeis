package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064551.
 * @author Sean A. Irvine
 */
public class A064551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064551() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {1, 1, 1, 1, 3});
  }
}
