package irvine.oeis.a394;

import irvine.oeis.gf.GfSequence;

/**
 * A394945 Number of well-formed bracketed words of total length 2n built from the symbol * (of length 2) and two unary bracket types () and [], with no empty bracket pair, where every maximal chain of unary brackets is written in canonical weakly increasing order.
 * @author Sean A. Irvine
 */
public class A394945 extends GfSequence {

  /** Construct the sequence. */
  public A394945() {
    super(0, "1 + (1 - 3*x + x^2 - sqrt((1-3*x+x^2)^2 - 4*x*(2*x - x^2))) / (2*(2*x - x^2))");
  }
}
