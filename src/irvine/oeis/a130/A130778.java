package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130778 Period 6: repeat [1, -1, -3, -3, -1, 1].
 * @author Sean A. Irvine
 */
public class A130778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130778() {
    super(new long[] {1, -2, 2}, new long[] {1, -1, -3});
  }
}
