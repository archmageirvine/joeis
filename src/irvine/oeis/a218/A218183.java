package irvine.oeis.a218;
// manually hologf4/hologf at 2022-11-09 13:39

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A218183 Number of true entries in truth tables of bracketed formulas connected by modified implication (case 3).
 * @author Georg Fischer
 */
public class A218183 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A218183() {
    // o.g.f. -5/4+3/4*(1-8*x)^(1/2)+3/4*(3-4*x-2*(1-8*x)^(1/2))^(1/2)+x-1/4*(1-8*x)^(1/2)*(3-4*x-2*(1-8*x)^(1/2))^(1/2)
    // recurrence -5*n*(n-1)*(n-2)*(40*(n-4)^2-24*n+95)*u(n)+4*(n-1)*(n-2)*(720*(n-4)^3+568*(n-4)^2-978*n+3977)*u(n-1)-4*(n-2)*(2080*(n-4)^4+1952*(n-4)^3-6316*(n-4)^2-4976*n+20819)*u(n-2)-16*(2*n-7)*(320*(n-4)^4+128*(n-4)^3+1168*(n-4)^2+1504*n-5791)*u(n-3)-256*(n-5)*(2*n-7)*(2*n-9)*(40*(n-4)^2+56*n-209)*u(n-4) = 0
    super(0, "[[0],[34755840,-45893888, 24034304,-6239232, 802816,-40960],[9702000,-12136992, 6075136,-1530368, 195584,-10240],[2618520,-4455116, 2932448,-930384, 141952,-8320],[-264120, 628484,-545092, 218776,-40928, 2880],[0,-7350, 14465,-9235, 2320,-200]]", "[0, 0, 1, 4, 19]", 0);
  }
}
