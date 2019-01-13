package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094286.
 * @author Sean A. Irvine
 */
public class A094286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094286() {
    super(new long[] {4, -2, -6, 5}, new long[] {1, 2, 4, 9});
  }
}
