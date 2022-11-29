package irvine.oeis.a117;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A117187 Expansion of (1+x)c(x^2)/((1-x^2*c(x^2))sqrt(1-4x^2)), c(x) the g.f. of A000108.
 * @author Georg Fischer
 */
public class A117187 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A117187() {
    super(0, "[[0],[0,32,64,44,12],[24,20,-4],[0,-12,-11,-14,-3]]", "1", 0);
  }
}
