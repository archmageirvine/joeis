package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232494.
 * @author Sean A. Irvine
 */
public class A232494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232494() {
    super(new long[] {144, -96, 0, 8}, new long[] {1, 6, 32, 160});
  }
}
