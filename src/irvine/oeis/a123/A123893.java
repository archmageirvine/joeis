package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123893.
 * @author Sean A. Irvine
 */
public class A123893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123893() {
    super(new long[] {6, -6, 22, -11, 18, -6, 4}, new long[] {1, 4, 16, 58, 208, 750, 2708});
  }
}
