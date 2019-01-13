package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212686.
 * @author Sean A. Irvine
 */
public class A212686 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212686() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 0, 4, 8, 24, 40});
  }
}
