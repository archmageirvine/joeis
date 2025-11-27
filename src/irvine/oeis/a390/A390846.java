package irvine.oeis.a390;

import irvine.oeis.gf.EgfSequence;

/**
 * A390846 allocated for Ilya Gutkovskiy.
 * @author Sean A. Irvine
 */
public class A390846 extends EgfSequence {

  /** Construct the sequence. */
  public A390846() {
    super(0, "exp((1/2)*x^2+(1/6)*x^3+(1/24)*x^4)");
  }
}
