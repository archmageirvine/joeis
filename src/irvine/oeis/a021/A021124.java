package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021124 Expansion of 1/((1-x)*(1-2*x)*(1-5*x)*(1-7*x)).
 * @author Sean A. Irvine
 */
public class A021124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021124() {
    super(new long[] {-70, 129, -73, 15}, new long[] {1, 15, 152, 1314});
  }
}
