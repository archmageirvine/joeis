package irvine.oeis.a230;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A230074 Period 4: repeat [1, -2, 1, 0].
 * @author Sean A. Irvine
 */
public class A230074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230074() {
    super(1, new long[] {-1, -1, -1}, new long[] {1, -2, 1});
  }
}
