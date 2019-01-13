package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037697.
 * @author Sean A. Irvine
 */
public class A037697 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037697() {
    super(new long[] {-6, 1, 0, 0, 6}, new long[] {1, 8, 51, 306, 1837});
  }
}
