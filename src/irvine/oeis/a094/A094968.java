package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094968.
 * @author Sean A. Irvine
 */
public class A094968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094968() {
    super(new long[] {2, -3, -1, 3}, new long[] {1, 4, 7, 14});
  }
}
