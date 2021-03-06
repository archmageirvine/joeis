package irvine.oeis.a199;
// Generated by gen_seq4.pl holos [0,1,-2,2,-2,1] [1,2,1,1,2,2,4,7,8,9] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A199627 G.f.: (1+x)^(2*g)*(1+x^3)^(3*g)/((1-x^2)*(1-x^4))-x^(2*g)*(1+x)^4/((1-x^2)*(1-x^4)) for g=1.
 * @author Georg Fischer
 */
public class A199627 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A199627() {
    super(1, "[0,1,-2,2,-2,1]", "[1,2,1,1,2,2,4,7,8,9]", 0);
  }
}
