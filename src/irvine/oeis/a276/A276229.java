package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276229.
 * @author Sean A. Irvine
 */
public class A276229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276229() {
    super(new long[] {1, -2, -1}, new long[] {0, 0, 1});
  }
}
