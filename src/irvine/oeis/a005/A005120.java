package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005120.
 * @author Sean A. Irvine
 */
public class A005120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005120() {
    super(new long[]{-1, -3, -5, -5, -5, -3}, new long[] {0, 1, -1, 1, -1, -1});
  }
}

