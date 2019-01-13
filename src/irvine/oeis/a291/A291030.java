package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291030.
 * @author Sean A. Irvine
 */
public class A291030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291030() {
    super(new long[] {-1, 9, -33, 68, -85, 68, -33, 9}, new long[] {1, 4, 15, 56, 208, 767, 2812, 10278});
  }
}
