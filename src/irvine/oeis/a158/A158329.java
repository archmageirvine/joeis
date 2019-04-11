package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158329 <code>484n^2 - 2n</code>.
 * @author Sean A. Irvine
 */
public class A158329 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158329() {
    super(new long[] {1, -3, 3}, new long[] {482, 1932, 4350});
  }
}
