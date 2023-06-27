package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121801 Expansion of 2*x^2*(3-x)/((1+x)*(1-3*x+x^2)).
 * @author Sean A. Irvine
 */
public class A121801 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121801() {
    super(1, new long[] {-1, 2, 2}, new long[] {0, 6, 10});
  }
}
