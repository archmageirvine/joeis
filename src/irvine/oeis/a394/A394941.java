package irvine.oeis.a394;

import irvine.oeis.gf.GfSequence;

/**
 * A394941 Number of well-formed bracketed words of total length n built from the symbol * (of length 1) and four unary bracket types, with no empty bracket pair.
 * @author Sean A. Irvine
 */
public class A394941 extends GfSequence {

  /** Construct the sequence. */
  public A394941() {
    super(0, "1+(1 - x - 4*x^2 - sqrt((1 - x - 4*x^2)^2 - 16*x^3))/(8*x^2)");
  }
}
