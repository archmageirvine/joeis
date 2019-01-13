package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152725.
 * @author Sean A. Irvine
 */
public class A152725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152725() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 63, 666, 3430, 12195, 34461});
  }
}
