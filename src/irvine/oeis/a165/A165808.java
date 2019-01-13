package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165808.
 * @author Sean A. Irvine
 */
public class A165808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165808() {
    super(new long[] {-1, 4, -6, 4}, new long[] {403, 4579, 16945, 41917});
  }
}
