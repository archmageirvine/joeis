package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276764.
 * @author Sean A. Irvine
 */
public class A276764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276764() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {10, 20, 74, 100, 202});
  }
}
