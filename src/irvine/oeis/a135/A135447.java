package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135447 Period 10: repeat [1, 2, 4, 8, 5, -1, -2, -4, -8, -5].
 * @author Sean A. Irvine
 */
public class A135447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135447() {
    super(new long[] {-1, 1, -1, 1}, new long[] {1, 2, 4, 8});
  }
}
