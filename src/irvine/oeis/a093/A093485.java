package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093485.
 * @author Sean A. Irvine
 */
public class A093485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093485() {
    super(new long[] {1, -3, 3}, new long[] {1, 19, 64});
  }
}
