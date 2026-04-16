package irvine.oeis.a394;

import irvine.oeis.gf.GfSequence;

/**
 * A394939 allocated for Yu Hin Au.
 * @author Sean A. Irvine
 */
public class A394939 extends GfSequence {

  /** Construct the sequence. */
  public A394939() {
    super(0, "1+(1 - x - 2*x^2 - sqrt((1 - x - 2*x^2)^2 - 8*x^3))/(4*x^2)");
  }
}
