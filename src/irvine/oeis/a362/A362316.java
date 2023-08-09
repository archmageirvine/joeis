package irvine.oeis.a362;
// manually holsig2/holos at 2023-08-08 18:53

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A362316 Expansion of e.g.f (exp(x)-1)*(exp(2*x)-1).
 * @author Georg Fischer
 */
public class A362316 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A362316() {
    super(0, "[0, 6,-11, 6,-1]", "0, 0, 4, 18, 64", 0);
  }
}
