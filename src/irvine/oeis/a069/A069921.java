package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069921 Define <code>C(n)</code> by the recursion <code>C(0) = 1 +</code> I where I^2 <code>= -1, C(n+1) = 1/(1+C(n))</code>; then <code>a(n) = (-1)^n/Im(C(n))</code> where <code>Im(z)</code> is the imaginary part of the complex number z.
 * @author Sean A. Irvine
 */
public class A069921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069921() {
    super(new long[] {-1, 2, 2}, new long[] {1, 5, 10});
  }
}
