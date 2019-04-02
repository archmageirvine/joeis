package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121801 Expansion of 2*x^2*(3-x)/((1+x)*(x^2-3*x+1)).
 * @author Sean A. Irvine
 */
public class A121801 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121801() {
    super(new long[] {-1, 2, 2}, new long[] {0, 6, 10});
  }
}
