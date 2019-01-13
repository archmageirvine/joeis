package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081018.
 * @author Sean A. Irvine
 */
public class A081018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081018() {
    super(new long[] {1, -8, 8}, new long[] {0, 2, 15});
  }
}
