package irvine.oeis.a394;

import irvine.oeis.gf.GfSequence;

/**
 * A394942 Number of well-formed bracketed words of total length n built from the symbol * (of length 1) and two unary bracket types () and [], with no empty bracket pair, where every maximal chain of unary brackets is written in canonical weakly increasing order.
 * @author Sean A. Irvine
 */
public class A394942 extends GfSequence {

  /** Construct the sequence. */
  public A394942() {
    super(0, "1+(1 - x - 2*x^2 + x^4 - sqrt((1 - x - 2*x^2 + x^4)^2 - 4*x*(2*x^2 - x^4)))/(2*(2*x^2 - x^4))");
  }
}
