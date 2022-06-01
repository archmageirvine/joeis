package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069921 Define C(n) by the recursion C(0) = 1 + I where I^2 = -1, C(n+1) = 1/(1+C(n)); then a(n) = (-1)^n/Im(C(n)) where Im(z) is the imaginary part of the complex number z.
 * @author Sean A. Irvine
 */
public class A069921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069921() {
    super(new long[] {-1, 2, 2}, new long[] {1, 5, 10});
  }
}
