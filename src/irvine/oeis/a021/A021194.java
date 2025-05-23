package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021194 Expansion of 1/((1-x)*(1-2*x)*(1-6*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A021194 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021194() {
    super(new long[] {-108, 192, -101, 18}, new long[] {1, 18, 223, 2388});
  }
}
