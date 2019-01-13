package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175790.
 * @author Sean A. Irvine
 */
public class A175790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175790() {
    super(new long[] {1, 2, 1, 0, -1}, new long[] {1, -1, 1, 0, 1});
  }
}
