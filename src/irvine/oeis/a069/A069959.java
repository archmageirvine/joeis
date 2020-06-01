package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069959 Define <code>C(n)</code> by the recursion <code>C(0)=2*I</code> where <code>I^2=-1, C(n+1)=1/(1+C(n));</code> then <code>a(n)=2*(-1)^n/Im(C(n))</code> where <code>Im(z)</code> denotes the imaginary part of the complex number <code>z</code>.
 * @author Sean A. Irvine
 */
public class A069959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069959() {
    super(new long[] {-1, 2, 2}, new long[] {1, 5, 8});
  }
}
