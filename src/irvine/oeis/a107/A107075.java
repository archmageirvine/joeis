package irvine.oeis.a107;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A107075 Centered square numbers that are also centered pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A107075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107075() {
    super(1, new long[] {1, -323, 323}, new long[] {1, 181, 58141});
  }
}
