package irvine.oeis.a394;

import irvine.oeis.gf.GfSequence;

/**
 * A394945 allocated for Yu Hin Au.
 * @author Sean A. Irvine
 */
public class A394945 extends GfSequence {

  /** Construct the sequence. */
  public A394945() {
    super(0, "1 + (1 - 3*x + x^2 - sqrt((1-3*x+x^2)^2 - 4*x*(2*x - x^2))) / (2*(2*x - x^2))");
  }
}
