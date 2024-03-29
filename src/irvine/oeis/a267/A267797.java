package irvine.oeis.a267;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A267797 Lucas numbers of the form (x^3 + y^3) / 2 where x and y are distinct positive integers.
 * @author Sean A. Irvine
 */
public class A267797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267797() {
    super(1, new long[] {-1, 18}, new long[] {76, 1364});
  }
}
