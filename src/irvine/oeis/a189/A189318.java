package irvine.oeis.a189;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A189318 Expansion of 5*(1-2*x)/(1-3*x-2*x^2+4*x^3).
 * @author Sean A. Irvine
 */
public class A189318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189318() {
    super(new long[] {-4, 2, 3}, new long[] {5, 5, 25});
  }
}
