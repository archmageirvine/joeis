package irvine.oeis.a249;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A249999 Expansion of 1/((1-x)^2*(1-2*x)*(1-3*x)).
 * @author Sean A. Irvine
 */
public class A249999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249999() {
    super(new long[] {-6, 17, -17, 7}, new long[] {1, 7, 32, 122});
  }
}
