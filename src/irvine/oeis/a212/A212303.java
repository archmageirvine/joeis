package irvine.oeis.a212;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A212303 a(n) = n!/([(n-1)/2]!*[(n+1)/2]!) for n&gt;0, a(0)=0, and where [ ] = floor.
 * Recurrence:  -(n+1)*(n-1)*((n-2)^2+2*n-8)*a(n) - 4*n*(2*n-1)*a(n-1) + 4*n*(n-1)*((n-2)^2+4*n-9)*a(n-2) = 0
 * @author Georg Fischer
 */
public class A212303 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A212303() {
    super(0, "[[0],[0,20,-20,-4,4],[0,4,-8],[-4,-2,5,2,-1]]", "[0,1]", 0);
  }
}
