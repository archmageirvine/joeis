package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061679 Concatenation of n^3 and 7.
 * @author Sean A. Irvine
 */
public class A061679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061679() {
    super(new long[] {-1, 4, -6, 4}, new long[] {17, 87, 277, 647});
  }
}
