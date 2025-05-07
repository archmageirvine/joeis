package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021049 Expansion of 1/((1-x)*(1-2*x)*(1-3*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A021049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021049() {
    super(new long[] {-60, 116, -71, 16}, new long[] {1, 16, 185, 1940});
  }
}
