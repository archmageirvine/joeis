package irvine.oeis.a189;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A189356 a(n) gives y-values solving the Diophantine equation 2*x^2 + (x-1)^2 = y^2 for positive x.
 * @author Sean A. Irvine
 */
public class A189356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189356() {
    super(1, new long[] {-1, 14}, new long[] {3, 41});
  }
}
