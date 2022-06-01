package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121955 Expansion of x^2*(9 + 8*x - 8*x^2)/((1+x-x^2)*(1-2*x-4*x^2)).
 * @author Sean A. Irvine
 */
public class A121955 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121955() {
    super(new long[] {-4, 2, 7, 1}, new long[] {0, 9, 17, 72});
  }
}
