package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281098.
 * @author Sean A. Irvine
 */
public class A281098 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281098() {
    super(new long[] {-1, 0, -1, 0, 1, 0, 2, 0, 1, 0, -1, 0}, new long[] {0, 1, 1, 3, 4, 1, 3, 1, 8, 3, 5, 1});
  }
}
