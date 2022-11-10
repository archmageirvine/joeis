package irvine.oeis.a233;
// manually hologf4/hologf at 2022-11-09 13:39

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A233130 Number of negative formulas with two connectives (-&gt; and *) and no variables.
 * @author Georg Fischer
 */
public class A233130 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A233130() {
    // o.g.f. (-3-(1-8*x)^(1/2)+(10+56*x+6*(1-8*x)^(1/2))^(1/2))/(8*x)
    super(0, "[[0],[-2304960, 3748304,-2216368, 567616,-53312],[-394800, 674200,-416112, 110360,-10608],[23280,-63548, 62957,-26752, 4063],[0,-571, 522, 151,-102],[0,-45, 17, 45,-17]]", "[1, 0, 2, 6]", 0);
  }
}
