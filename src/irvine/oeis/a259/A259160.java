package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259160 Positive squares <code>(A000290)</code> that are octagonal numbers <code>(A000567)</code> divided by 2.
 * @author Sean A. Irvine
 */
public class A259160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259160() {
    super(new long[] {1, -9603, 9603}, new long[] {4, 39204, 376437604});
  }
}
