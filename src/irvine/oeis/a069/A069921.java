package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069921 Define C(n) by the recursion C(0) <code>= 1 +</code> I where I^2 <code>= -1,</code> C(n+1) = 1/(1+C(n)); then <code>a(n) =</code> (-1)^n/Im(C(n)) where Im(z) is the imaginary part of the complex number z.
 * @author Sean A. Irvine
 */
public class A069921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069921() {
    super(new long[] {-1, 2, 2}, new long[] {1, 5, 10});
  }
}
