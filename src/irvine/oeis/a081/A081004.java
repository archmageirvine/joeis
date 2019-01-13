package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081004.
 * @author Sean A. Irvine
 */
public class A081004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081004() {
    super(new long[] {1, -8, 8}, new long[] {2, 9, 56});
  }
}
