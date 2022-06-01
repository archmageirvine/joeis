package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120468 Expansion of -2*x*(-8-12*x+9*x^2) / ( (x-1)*(3*x-1)*(3*x+1)*(1+x) ).
 * @author Sean A. Irvine
 */
public class A120468 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120468() {
    super(new long[] {-9, 0, 10, 0}, new long[] {0, 16, 24, 142});
  }
}
