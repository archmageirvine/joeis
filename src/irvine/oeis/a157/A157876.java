package irvine.oeis.a157;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A157876 Let f(x) = 1 + x^2 + x^4 + x^5 + x^6 + x^10 + x^11; sequence has g.f. g(x) = 1/(x^11*f(1/x)).
 * @author Georg Fischer
 */
public class A157876 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A157876() {
    super(0, "[0,-1, 0,-1, 0,-1,-1,-1, 0, 0, 0,-1,-1]", "1", 0);
  }
}
