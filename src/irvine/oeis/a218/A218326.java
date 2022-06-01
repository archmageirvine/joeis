package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218326 Odd octagonal pyramidal numbers.
 * @author Sean A. Irvine
 */
public class A218326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218326() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 9, 135, 231, 765, 1045, 2275});
  }
}
