package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259160 Positive squares (A000290) that are octagonal numbers (A000567) divided by 2.
 * @author Sean A. Irvine
 */
public class A259160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259160() {
    super(new long[] {1, -9603, 9603}, new long[] {4, 39204, 376437604});
  }
}
