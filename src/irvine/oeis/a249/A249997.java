package irvine.oeis.a249;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A249997 Expansion of 1/((1-x)*(1+3*x)*(1-4*x)).
 * @author Sean A. Irvine
 */
public class A249997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249997() {
    super(new long[] {-12, 11, 2}, new long[] {1, 2, 15});
  }
}
