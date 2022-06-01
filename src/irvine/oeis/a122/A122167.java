package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122167 Expansion of x*(-1+5*x-6*x^2+x^3) / ( (2*x-1)*(x^3-3*x^2+1) ).
 * @author Sean A. Irvine
 */
public class A122167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122167() {
    super(new long[] {2, -7, 3, 2}, new long[] {1, -3, 3, -11});
  }
}
