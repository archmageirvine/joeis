package irvine.oeis.a275;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A275543 A081585 and A069129 interleaved.
 * @author Sean A. Irvine
 */
public class A275543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275543() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 1, 9, 17});
  }
}
