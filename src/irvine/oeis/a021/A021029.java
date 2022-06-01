package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021029 Expansion of 1/((1-x)*(1-2*x)*(1-3*x)*(1-6*x)).
 * @author Sean A. Irvine
 */
public class A021029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021029() {
    super(new long[] {-36, 72, -47, 12}, new long[] {1, 12, 97, 672});
  }
}
