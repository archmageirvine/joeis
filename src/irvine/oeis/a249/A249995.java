package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249995 Expansion of 1/((1+2*x)*(1-3*x)*(1-4*x)).
 * @author Sean A. Irvine
 */
public class A249995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249995() {
    super(new long[] {-24, 2, 5}, new long[] {1, 5, 27});
  }
}
