package irvine.oeis.a181;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A181685 Expansion of 36*x^2*(1+6*x-36*x^2) / ( (1-6*x)^2 *(1+6*x+36*x^2) ).
 * @author Sean A. Irvine
 */
public class A181685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181685() {
    super(new long[] {-1296, 216, 0, 6}, new long[] {0, 36, 432, 1296});
  }
}
