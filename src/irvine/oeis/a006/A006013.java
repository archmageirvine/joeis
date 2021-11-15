package irvine.oeis.a006;

import irvine.oeis.HolonomicRecurrence;

/**
 * A006013 a(n) = binomial(3*n+1,n)/(n+1).
 * Recurrence: 2*(n+1)*(2n+1)*a(n) = 3*(3n-1)*(3n+1)*a(n-1).
 * @author Georg Fischer
 */
public class A006013 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A006013() {
    super(0, "[[0],[-3, 0, 27],[-2,-6,-4]]", "1", 0);
  }
}
