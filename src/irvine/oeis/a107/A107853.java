package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107853 G.f. <code>x*(x-1)*(x+1)^3/((2*x^3+x^2-1)*(x^4+1))</code>.
 * @author Sean A. Irvine
 */
public class A107853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107853() {
    super(new long[] {2, 1, 0, -1, 2, 1, 0}, new long[] {0, 1, 2, 1, 2, 3, 2});
  }
}
