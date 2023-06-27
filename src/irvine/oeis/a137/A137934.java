package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137934 Period 6: 2,2,2,2,2,0.
 * @author Sean A. Irvine
 */
public class A137934 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137934() {
    super(1, new long[] {1, 0, 0, 0, 0, 0}, new long[] {2, 2, 2, 2, 2, 0});
  }
}
