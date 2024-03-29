package irvine.oeis.a329;
// Generated by gen_seq4.pl holos at 2021-06-07 19:33
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A329695 Number of excursions of length n with Motzkin-steps avoiding the consecutive steps UD, HU and DH.
 * radtorec(1/2*(1-x+x^2-(4*x^6-4*x^5+x^4+2*x^3-x^2-2*x+1)^(1/2))/x^2/(1-x))
 * @author Georg Fischer
 */
public class A329695 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A329695() {
    super(0, "[[0],[-1248, 200,-8],[4752,-828, 36],[-9012, 1766,-86],[9726,-2165, 119],[-5244, 1358,-86],[234,-64, 4],[1134,-493, 49],[102, 96,-24],[-798, 340,-28],[414,-285, 39],[-54, 66,-12],[0, 10,-10],[-6, 3, 9],[0,-4,-2]]", "1, 1, 1, 2, 2, 3, 4, 6, 10, 16, 28, 48, 85, 152, 273, 497, 906, 1665, 3071", 0);
  }
}
