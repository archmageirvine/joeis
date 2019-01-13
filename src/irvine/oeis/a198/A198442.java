package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198442.
 * @author Sean A. Irvine
 */
public class A198442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198442() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 0, 2, 3});
  }
}
