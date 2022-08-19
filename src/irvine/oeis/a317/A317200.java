package irvine.oeis.a317;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A317200 G.f.: -x*(2*x^3+2*x^2+x-2)/(x^4-2*x+1).
 * @author Georg Fischer
 */
public class A317200 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A317200() {
    super(1, "[0, 1, 0, 0,-2, 1]", "[0, 2, 3, 4, 6]", 0);
  }
}
