package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049016 Expansion of 1/((1-x)^5-x^5).
 * @author Sean A. Irvine
 */
public class A049016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049016() {
    super(new long[] {2, -5, 10, -10, 5}, new long[] {1, 5, 15, 35, 70});
  }
}
