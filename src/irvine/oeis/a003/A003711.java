package irvine.oeis.a003;

import irvine.oeis.gf.EgfSequence;

/**
 * A003711 Expansion of e.g.f. cos(tanh(x)) (even powers only).
 * @author Sean A. Irvine
 */
public class A003711 extends EgfSequence {

  /** Construct the sequence. */
  public A003711() {
    super(0, 2, "cos(tanh(x))");
  }
}
