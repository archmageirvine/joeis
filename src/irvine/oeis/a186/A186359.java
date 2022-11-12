package irvine.oeis.a186;
// manually hologf4/hologfe at 2022-11-10 10:21

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A186359 Number of permutations of {1,2,...,n} having no up-down cycles. A cycle (b(1), b(2), ...) is said to be up-down if, when written with its smallest element in the first position, it satisfies b(1)&lt;b(2)&gt;b(3)&lt;... .
 * @author Georg Fischer
 */
public class A186359 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A186359() {
    // o.g.f. (1-sin(z))/(1-z)
    // recurrence (n-2)*u(n-3)+(-n+2)*u(n-2)+(n-2)*(n-1)*n*u(n-1)-(n-2)*(n-1)*n*u(n) = 0
    super(0, "[[0],[-2,1],[2,-1],[0,2,-3,1],[0,-2,3,-1]]", "[1,0,0,1]", 0);
    setGfType(1);
  }
}
