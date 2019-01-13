package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175713.
 * @author Sean A. Irvine
 */
public class A175713 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175713() {
    super(new long[] {2, -4, 4, 1}, new long[] {1, 1, 5, 5});
  }
}
