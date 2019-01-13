package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139800.
 * @author Sean A. Irvine
 */
public class A139800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139800() {
    super(new long[] {2, 1, 1, 1}, new long[] {1, 0, 0, 0});
  }
}
