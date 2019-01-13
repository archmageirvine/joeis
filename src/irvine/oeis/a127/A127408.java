package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127408.
 * @author Sean A. Irvine
 */
public class A127408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127408() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {18, 144, 625, 1980, 5145, 11648, 23814});
  }
}
