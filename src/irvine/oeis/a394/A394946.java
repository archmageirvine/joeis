package irvine.oeis.a394;

import irvine.oeis.gf.GfSequence;

/**
 * A394946 allocated for Yu Hin Au.
 * @author Sean A. Irvine
 */
public class A394946 extends GfSequence {

  /** Construct the sequence. */
  public A394946() {
    super(0, "1 + (1 - 4*x + 3*x^2 - x^3 - sqrt((1-4*x+3*x^2-x^3)^2 - 4*x*(3*x - 3*x^2 + x^3))) / (2*(3*x - 3*x^2 + x^3))");
  }
}
