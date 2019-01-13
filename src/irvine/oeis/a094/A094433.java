package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094433.
 * @author Sean A. Irvine
 */
public class A094433 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094433() {
    super(new long[] {-6, 6}, new long[] {1, 2});
  }
}
