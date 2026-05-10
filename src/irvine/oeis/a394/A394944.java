package irvine.oeis.a394;

import irvine.oeis.gf.GfSequence;

/**
 * A394944 Number of well-formed bracketed words of total length n built from the symbol * (of length 1) and four unary bracket types (), [], {}, and &lt;&gt;, with no empty bracket pair, where every maximal chain of unary brackets is written in canonical weakly increasing order.
 * @author Sean A. Irvine
 */
public class A394944 extends GfSequence {

  /** Construct the sequence. */
  public A394944() {
    super(0, "1 + (1 - x - 4*x^2 + 6*x^4 - 4*x^6 + x^8 - sqrt((1-x-4*x^2+6*x^4-4*x^6+x^8)^2 - 4*x*(4*x^2 - 6*x^4 + 4*x^6 - x^8))) / (2*(4*x^2 - 6*x^4 + 4*x^6 - x^8))");
  }
}
