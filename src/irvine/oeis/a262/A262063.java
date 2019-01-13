package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262063.
 * @author Sean A. Irvine
 */
public class A262063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262063() {
    super(new long[] {1, -27, 27}, new long[] {78, 2100, 54594});
  }
}
