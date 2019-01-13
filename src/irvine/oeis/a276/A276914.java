package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276914.
 * @author Sean A. Irvine
 */
public class A276914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276914() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 10, 15, 36});
  }
}
