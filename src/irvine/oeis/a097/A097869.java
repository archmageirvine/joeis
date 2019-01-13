package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097869.
 * @author Sean A. Irvine
 */
public class A097869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097869() {
    super(new long[] {-1, 2, -1, 0, 2, -4, 2, 0, -1, 2}, new long[] {1, 1, 2, 2, 6, 7, 11, 12, 21, 25});
  }
}
