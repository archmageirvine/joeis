package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021094 Expansion of 1/((1-x)*(1-2*x)*(1-4*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A021094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021094() {
    super(new long[] {-88, 162, -91, 18}, new long[] {1, 18, 233, 2718});
  }
}
