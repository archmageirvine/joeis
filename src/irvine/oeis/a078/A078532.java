package irvine.oeis.a078;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A078532 Coefficients of power series that satisfies A(x)^3 - 9*x*A(x)^4 = 1, A(0)=1.
 * @author Georg Fischer
 */
public class A078532 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A078532() {
    super(0, "[[0],[11880,-37584,31104,-6912],[0],[0],[0,-1,0,1]]", "1,3,27", 0);
  }
}
