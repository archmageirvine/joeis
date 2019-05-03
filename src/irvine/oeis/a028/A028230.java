package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028230 Bisection of <code>A001353</code>. Indices of square numbers which are also octagonal.
 * @author Sean A. Irvine
 */
public class A028230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028230() {
    super(new long[] {-1, 14}, new long[] {1, 15});
  }
}
