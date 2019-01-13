package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291248.
 * @author Sean A. Irvine
 */
public class A291248 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291248() {
    super(new long[] {1, 1, -6, -3, 12, 3, -12, -3, 6, 1}, new long[] {1, 2, 5, 12, 27, 65, 146, 346, 788, 1845});
  }
}
