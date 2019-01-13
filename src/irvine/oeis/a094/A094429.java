package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094429.
 * @author Sean A. Irvine
 */
public class A094429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094429() {
    super(new long[] {7, -14, 7}, new long[] {0, 7, 42});
  }
}
