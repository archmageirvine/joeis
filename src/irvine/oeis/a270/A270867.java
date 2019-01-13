package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270867.
 * @author Sean A. Irvine
 */
public class A270867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270867() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 8, 25, 58});
  }
}
