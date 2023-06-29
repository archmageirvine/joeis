package irvine.oeis.a229;
// manually hologfm/hologf at 2022-12-01 17:28

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A229026 Expansion of 1/((1-x)*((1-5x)^2)*(1-8x)).
 * @author Georg Fischer
 */
public class A229026 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A229026() {
    // o.g.f. 1/(1-x)/(1-5*x)^2/(1-8*x)
    super(0, "[[0],[-200],[305],[-123],[19],[-1]]", "1", 1);
  }
}
