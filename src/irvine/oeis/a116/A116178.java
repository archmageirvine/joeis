package irvine.oeis.a116;
// manually morfps at 2021-09-20

import irvine.oeis.base.MorphismFixedPointSequence;


/**
 * A116178 Stewart's choral sequence: a(3n) = 0, a(3n-1) = 1, a(3n+1) = a(n).
 * Fixed point of the morphism 0-&gt;001, 1-&gt;011, starting from a(0) = 0.
 * @author Georg Fischer
 */
public class A116178 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A116178() {
    super("0", "0010", "0->001, 1->011");
  }
}
