package irvine.oeis.a394;

import irvine.oeis.gf.GfSequence;

/**
 * A394943 allocated for Yu Hin Au.
 * @author Sean A. Irvine
 */
public class A394943 extends GfSequence {

  /** Construct the sequence. */
  public A394943() {
    super(0, "1 + (1 - x - 3*x^2 + 3*x^4 - x^6 - sqrt((1-x-3*x^2+3*x^4-x^6)^2 - 4*x*(3*x^2 - 3*x^4 + x^6))) / (2*(3*x^2 - 3*x^4 + x^6))");
  }
}
