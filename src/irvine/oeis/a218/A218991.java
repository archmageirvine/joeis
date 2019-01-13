package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218991.
 * @author Sean A. Irvine
 */
public class A218991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218991() {
    super(new long[] {-1, -5, 7}, new long[] {6, 36, 221});
  }
}
