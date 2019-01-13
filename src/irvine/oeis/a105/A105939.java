package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105939.
 * @author Sean A. Irvine
 */
public class A105939 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105939() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {20, 140, 560, 1680, 4200, 9240, 18480});
  }
}
