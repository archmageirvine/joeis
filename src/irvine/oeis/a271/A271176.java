package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271176 Expansion of -(4*x^3-7*x^2+4*x-1)/(2*x^4-5*x^3+8*x^2-5*x+1).
 * @author Sean A. Irvine
 */
public class A271176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271176() {
    super(new long[] {-2, 5, -8, 5}, new long[] {1, 1, 4, 13});
  }
}
