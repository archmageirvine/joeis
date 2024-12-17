package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021034 Expansion of 1/((1-x)*(1-2*x)*(1-3*x)*(1-7*x)).
 * @author Sean A. Irvine
 */
public class A021034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021034() {
    super(new long[] {-42, 83, -53, 13}, new long[] {1, 13, 116, 902});
  }
}
