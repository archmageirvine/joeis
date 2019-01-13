package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094256.
 * @author Sean A. Irvine
 */
public class A094256 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094256() {
    super(new long[] {-1, 10, -15, 7}, new long[] {1, 7, 34, 143});
  }
}
