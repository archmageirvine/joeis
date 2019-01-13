package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216486.
 * @author Sean A. Irvine
 */
public class A216486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216486() {
    super(new long[] {1, -3, -6, 4, 5, -1}, new long[] {0, 1, -1, 4, -3, 14});
  }
}
