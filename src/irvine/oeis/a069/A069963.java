package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069963 Define C(n) by the recursion C(0) = 6*i where i^2 = -1, C(n+1) = 1/(1 + C(n)), then a(n) = 6*(-1)^n/Im(C(n)) where Im(z) denotes the imaginary part of z.
 * @author Sean A. Irvine
 */
public class A069963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069963() {
    super(new long[] {-1, 2, 2}, new long[] {1, 37, 40});
  }
}
