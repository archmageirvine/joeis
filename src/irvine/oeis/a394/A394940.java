package irvine.oeis.a394;

import irvine.oeis.gf.GfSequence;

/**
 * A394940 allocated for Yu Hin Au.
 * @author Sean A. Irvine
 */
public class A394940 extends GfSequence {

  /** Construct the sequence. */
  public A394940() {
    super(0, "1+(1 - x - 3*x^2 - sqrt((1 - x - 3*x^2)^2 - 12*x^3))/(6*x^2)");
  }
}
