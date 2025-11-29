package irvine.oeis.a390;

import irvine.oeis.gf.EgfSequence;

/**
 * A390846 Expansion of e.g.f. exp( x^2/2 + x^3/6 + x^4/24 ).
 * @author Sean A. Irvine
 */
public class A390846 extends EgfSequence {

  /** Construct the sequence. */
  public A390846() {
    super(0, "exp((1/2)*x^2+(1/6)*x^3+(1/24)*x^4)");
  }
}
