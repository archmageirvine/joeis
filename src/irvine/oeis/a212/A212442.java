package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212442.
 * @author Sean A. Irvine
 */
public class A212442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212442() {
    super(new long[] {-1, -8, 76, -136, -38, 136, 76, 8}, new long[] {1, 8, 140, 1864, 26602, 373080, 5253564, 73911192});
  }
}
