package irvine.oeis.a269;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A269226 Period 6: repeat [3, 9, 6, 6, 9, 3].
 * @author Sean A. Irvine
 */
public class A269226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269226() {
    super(1, new long[] {1, -1, 1, -1, 1}, new long[] {3, 9, 6, 6, 9});
  }
}
