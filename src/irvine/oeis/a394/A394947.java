package irvine.oeis.a394;

import irvine.oeis.gf.GfSequence;

/**
 * A394947 allocated for Yu Hin Au.
 * @author Sean A. Irvine
 */
public class A394947 extends GfSequence {

  /** Construct the sequence. */
  public A394947() {
    super(0, "1 + (1 - 5*x + 6*x^2 - 4*x^3 + x^4 - sqrt((1-5*x+6*x^2-4*x^3+x^4)^2 - 4*x*(4*x - 6*x^2 + 4*x^3 - x^4))) / (2*(4*x - 6*x^2 + 4*x^3 - x^4))");
  }
}
