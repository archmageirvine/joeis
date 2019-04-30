package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069961 Define <code>C(n)</code> by the recursion C(0)=4*I where I^2=-1, <code>C(n+1)=1/(1+C(n))</code>; then <code>a(n)=4*(-1)^n/Im(C(n))</code> where <code>Im(z)</code> denotes the imaginary part of the complex number z.
 * @author Sean A. Irvine
 */
public class A069961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069961() {
    super(new long[] {-1, 2, 2}, new long[] {1, 17, 20});
  }
}
