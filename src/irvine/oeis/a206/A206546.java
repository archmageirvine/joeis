package irvine.oeis.a206;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A206546 Period 8: repeat [1, 7, 11, 13, 13, 11, 7, 1].
 * @author Sean A. Irvine
 */
public class A206546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206546() {
    super(1, new long[] {1, -1, 1, -1, 1, -1, 1}, new long[] {1, 7, 11, 13, 13, 11, 7});
  }
}
