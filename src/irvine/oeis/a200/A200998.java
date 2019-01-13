package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200998.
 * @author Sean A. Irvine
 */
public class A200998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200998() {
    super(new long[] {1, -195, 195}, new long[] {0, 21, 4095});
  }
}
