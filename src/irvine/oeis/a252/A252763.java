package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252763.
 * @author Sean A. Irvine
 */
public class A252763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252763() {
    super(new long[] {1, -195, 195}, new long[] {8, 1480, 287064});
  }
}
