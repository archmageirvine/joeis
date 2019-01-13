package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179934.
 * @author Sean A. Irvine
 */
public class A179934 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179934() {
    super(new long[] {1, -1, -10, 10, 1}, new long[] {4, 9, 36, 85, 352});
  }
}
