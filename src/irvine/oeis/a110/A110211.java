package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110211.
 * @author Sean A. Irvine
 */
public class A110211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110211() {
    super(new long[] {6, 0, -5}, new long[] {-1, 3, -15});
  }
}
