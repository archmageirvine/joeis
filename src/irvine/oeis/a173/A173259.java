package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173259 Period 3: repeat [4, 1, 4].
 * @author Sean A. Irvine
 */
public class A173259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173259() {
    super(1, new long[] {1, 0, 0}, new long[] {4, 1, 4});
  }
}
