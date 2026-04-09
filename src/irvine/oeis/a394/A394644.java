package irvine.oeis.a394;

import irvine.oeis.gf.EgfSequence;

/**
 * A394644 Expansion of e.g.f. exp((4/3)*x^3+x).
 * @author Sean A. Irvine
 */
public class A394644 extends EgfSequence {

  /** Construct the sequence. */
  public A394644() {
    super(0, "exp(x+(4/3)*x^3)");
  }
}
