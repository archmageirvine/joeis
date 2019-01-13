package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080012.
 * @author Sean A. Irvine
 */
public class A080012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080012() {
    super(new long[] {-1, -1, -1, -2, 1, 5, 4, 3, 2, 0}, new long[] {1, 0, 1, 2, 6, 11, 23, 51, 113, 244});
  }
}
