package irvine.oeis.a394;

import irvine.oeis.gf.GfSequence;

/**
 * A394947 Number of well-formed bracketed words of total length 2n built from the symbol * (of length 2) and four unary bracket types (), [], {}, and &lt;&gt;, with no empty bracket pair, where every maximal chain of unary brackets is written in canonical weakly increasing order.
 * @author Sean A. Irvine
 */
public class A394947 extends GfSequence {

  /** Construct the sequence. */
  public A394947() {
    super(0, "1 + (1 - 5*x + 6*x^2 - 4*x^3 + x^4 - sqrt((1-5*x+6*x^2-4*x^3+x^4)^2 - 4*x*(4*x - 6*x^2 + 4*x^3 - x^4))) / (2*(4*x - 6*x^2 + 4*x^3 - x^4))");
  }
}
