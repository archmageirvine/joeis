package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069959 Define C(n) by the recursion C(0)=2*I where I^2=-1, C(n+1)=1/(1+C(n)); then a(n)=2*(-1)^n/Im(C(n)) where Im(z) denotes the imaginary part of the complex number z.
 * @author Sean A. Irvine
 */
public class A069959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069959() {
    super(new long[] {-1, 2, 2}, new long[] {1, 5, 8});
  }
}
