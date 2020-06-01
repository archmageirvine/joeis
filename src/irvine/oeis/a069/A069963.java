package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069963 Define <code>C(n)</code> by the recursion <code>C(0)=6*I</code> where <code>I^2=-1, C(n+1)=1/(1+C(n));</code> then <code>a(n)=6*(-1)^n/Im(C(n))</code> where <code>Im(z)</code> denotes the imaginary part of the complex number <code>z</code>.
 * @author Sean A. Irvine
 */
public class A069963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069963() {
    super(new long[] {-1, 2, 2}, new long[] {1, 37, 40});
  }
}
