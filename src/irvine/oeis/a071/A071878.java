package irvine.oeis.a071;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A071878 G.f. D(x) satisfies: D(x) = (1 + x*D(x))*(1 + 2*x*D(x))*(1 + 3*x*D(x)).
 * Recurrence: -12*(n+1)*(2*n+3)*(359*n-143)*u(n)-(-111649*(n-3)^3-1072017*(n-3)^2-3402698*n+6642054)*u(n-1)+24*(n-1)*(718*(n-3)^2+4381*n-6645)*u(n-2)-4*(359*n+216)*(n-1)*(n-2)*u(n-3) = 0
 * @author Georg Fischer
 */
public class A071878 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A071878() {
    super(0, "[[0],[-1728,-280,3444,-1436],[4392,-6144,-15480,17232],[-8424,-14881,67176,111649],[5148,-4344,-18108,-8616]]", "1", 0);
  }
}
