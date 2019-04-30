package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065928 <code>(x,y) = (a(n),a(n+1))</code> are the solutions of <code>(t(x)+t(y))/(1+xy)) = t(2) = 3</code>, where <code>t(n)</code> denotes the n-th triangular number <code>t(n) = n(n+1)/2</code>.
 * @author Sean A. Irvine
 */
public class A065928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065928() {
    super(new long[] {1, -7, 7}, new long[] {2, 11, 63});
  }
}
