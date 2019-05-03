package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189740 Partial sums of tetranacci numbers <code>(A000288)</code>.
 * @author Sean A. Irvine
 */
public class A189740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189740() {
    super(new long[] {-1, 0, 0, 0, 2}, new long[] {1, 2, 3, 4, 8});
  }
}
