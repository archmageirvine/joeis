package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212257.
 * @author Sean A. Irvine
 */
public class A212257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212257() {
    super(new long[] {1, -4, 6, -4, 0, 4, -6, 4}, new long[] {1, 2, 21, 64, 157, 322, 601, 1024});
  }
}
