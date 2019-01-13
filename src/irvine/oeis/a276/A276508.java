package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276508.
 * @author Sean A. Irvine
 */
public class A276508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276508() {
    super(new long[] {5, -6, 6}, new long[] {0, 2, 9});
  }
}
