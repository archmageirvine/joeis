package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291032.
 * @author Sean A. Irvine
 */
public class A291032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291032() {
    super(new long[] {-1, 9, -33, 68, -87, 68, -33, 9}, new long[] {1, 4, 15, 54, 188, 645, 2208, 7570});
  }
}
