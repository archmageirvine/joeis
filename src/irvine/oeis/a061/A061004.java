package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061004.
 * @author Sean A. Irvine
 */
public class A061004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061004() {
    super(new long[] {1, -5, 9, -6, 0, 0, 0, 6, -9, 5}, new long[] {0, 2, 20, 114, 434, 1296, 3268, 7282, 14762, 27778});
  }
}
