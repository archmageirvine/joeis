package irvine.oeis.a018;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A018091 Expansion of 1/((1-3*x)*(1-9*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A018091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018091() {
    super(new long[] {297, -159, 23}, new long[] {1, 23, 370});
  }
}
