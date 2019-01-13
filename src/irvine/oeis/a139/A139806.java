package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139806.
 * @author Sean A. Irvine
 */
public class A139806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139806() {
    super(new long[] {2, 1, 1, 1}, new long[] {1, 3, 7, 15});
  }
}
