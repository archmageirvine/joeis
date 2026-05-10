package irvine.oeis.a394;

import irvine.oeis.gf.GfSequence;

/**
 * A394943 Number of well-formed bracketed words of total length n built from the symbol * (of length 1) and three unary bracket types (), [], and {}, with no empty bracket pair, where every maximal chain of unary brackets is written in canonical weakly increasing order.
 * @author Sean A. Irvine
 */
public class A394943 extends GfSequence {

  /** Construct the sequence. */
  public A394943() {
    super(0, "1 + (1 - x - 3*x^2 + 3*x^4 - x^6 - sqrt((1-x-3*x^2+3*x^4-x^6)^2 - 4*x*(3*x^2 - 3*x^4 + x^6))) / (2*(3*x^2 - 3*x^4 + x^6))");
  }
}
