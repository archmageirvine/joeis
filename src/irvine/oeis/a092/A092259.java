package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092259.
 * @author Sean A. Irvine
 */
public class A092259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092259() {
    super(new long[] {-1, 1, 1}, new long[] {4, 8, 16});
  }
}
