package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002315.
 * @author Sean A. Irvine
 */
public class A002315 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002315() {
    super(new long[] {-1, 6}, new long[] {1, 7});
  }
}
