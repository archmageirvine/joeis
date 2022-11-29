package irvine.oeis.a128;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A128015 Binomial coefficients C(2n+1,n) repeated.
 * Recurrence: -(n+2)*(3*n-1)*a(n) - 4*a(n-1) + 4*(3*n+2)*n*a(n-2) = 0
 * @author Georg Fischer
 */
public class A128015 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A128015() {
    super(0, "[[0],[[0],[0,8,12],[-4],[2,-5,-3]]", "1,1", 0);
  }
}
