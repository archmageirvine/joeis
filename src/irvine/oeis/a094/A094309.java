package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094309.
 * @author Sean A. Irvine
 */
public class A094309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094309() {
    super(new long[] {-4, -2, 4}, new long[] {1, 4, 14});
  }
}
