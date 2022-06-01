package irvine.oeis.a132;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A132401 Period 8: repeat 0, 0, 1, 1, 2, -1, -1, -2.
 * @author Sean A. Irvine
 */
public class A132401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132401() {
    super(new long[] {-1, -1, -1, -1, -1, -1, -1}, new long[] {0, 0, 1, 1, 2, -1, -1});
  }
}
