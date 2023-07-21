package irvine.oeis.a116;
// manually holom/holos at 2023-07-20 14:24

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A116408 E.g.f. exp(x)*(Bessel_I(2,2*x) - Bessel_I(3,2*x) + Bessel_I(4,2*x)).
 * @author Georg Fischer
 */
public class A116408 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A116408() {
    super(0, "[[0],[0,-102, 99,-6, 9],[0,-139, 70,-1, 6],[288,-112,-2,-1,-3]]", "[0, 0, 1, 2, 7]", 0);
  }
}
