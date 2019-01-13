package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118647.
 * @author Sean A. Irvine
 */
public class A118647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118647() {
    super(new long[] {-1, 0, 1, 0, 1, 1}, new long[] {2, 4, 7, 11, 19, 33});
  }
}
