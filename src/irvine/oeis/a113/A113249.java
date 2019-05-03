package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113249 Corresponds to m <code>= 3</code> in a family of 4th order linear recurrence sequences given by <code>a(m,n) = m^4*a(n-4) + (2*m)^2*a(n-3) - 4*a(n-1), a(m,0) = -1, a(m,1) = 4, a(m,2) = -13 + 6*(m-1) + 3*(m-1)^2, a(m,3) = (-8+m^2)^2</code>.
 * @author Sean A. Irvine
 */
public class A113249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113249() {
    super(new long[] {81, 36, 0, -4}, new long[] {-1, 4, 11, 1});
  }
}
