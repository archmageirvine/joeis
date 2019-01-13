package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139814.
 * @author Sean A. Irvine
 */
public class A139814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139814() {
    super(new long[] {2, 1, 1, 1}, new long[] {0, 1, 3, 7});
  }
}
