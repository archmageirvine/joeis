package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175378.
 * @author Sean A. Irvine
 */
public class A175378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175378() {
    super(new long[] {2, 0, -4, 3, -1, -2, 3}, new long[] {0, 0, 0, 0, 1, 3, 5});
  }
}
