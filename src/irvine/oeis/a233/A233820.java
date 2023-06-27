package irvine.oeis.a233;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A233820 Period 4: repeat [20, 5, 15, 10].
 * @author Sean A. Irvine
 */
public class A233820 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233820() {
    super(1, new long[] {1, 0, 0, 0}, new long[] {20, 5, 15, 10});
  }
}
