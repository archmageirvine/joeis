package irvine.oeis.a067;
// Generated by gen_seq4.pl hologf4/hologf at 2022-11-11 22:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A067299 Second column of triangle A067298.
 * @author Georg Fischer
 */
public class A067299 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A067299() {
    // o.g.f. (2+x+3/2*(1+x)*(1-(1-16*x)^(1/2)))/(2*x+1)^2
    // recurrence -n*(17*n-7)*u(n)-(-238*(n-2)^2-412*n+760)*u(n-1)+16*(17*n+10)*(2*n-3)*u(n-2) = 0
    super(0, "[[0],[-480,-496,544],[192,-540,238],[0,7,-17]]", "[2,5,32]", 0);
  }
}
