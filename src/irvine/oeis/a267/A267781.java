package irvine.oeis.a267;
// manually hologfm/hologf at 2022-12-01 17:28

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A267781 Expansion of (x*(-14x^6 - 32x^5 + 16x^4 + 30x^3 - x + 14) + 17)/((x-1)^2*(x+1)).
 * @author Georg Fischer
 */
public class A267781 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A267781() {
    // o.g.f. (x*(-14*x^6-32*x^5+16*x^4+30*x^3-x+14)+17)/(-1+x)^2/(x+1)
    super(1, "[[0],[1],[-1],[-1],[1]]", "17, 31, 47, 61, 107, 137, 151, 167", 0);
  }
}
