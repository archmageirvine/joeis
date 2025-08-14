package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013546 Numerator of [x^(2n)] in the Taylor expansion cosh(cosec(x)-coth(x))=1 +x^2/72 -215*x^4/31104 +199159*x^6/235146240-...
 * @author Sean A. Irvine
 */
public class A013546 extends GfSequence {

  /** Construct the sequence. */
  public A013546() {
    super(0, 2, "cosh((xcsc(x) - xcoth(x))/x)");
  }
}
