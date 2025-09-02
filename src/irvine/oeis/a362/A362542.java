package irvine.oeis.a362;

import irvine.oeis.gf.GfSequence;

/**
 * A362542 Number of chordless cycles of length &gt;=4 in the n-Goldberg graph.
 * @author Sean A. Irvine
 */
public class A362542 extends GfSequence {

  /** Construct the sequence. */
  public A362542() {
    super(1, "(x^2*(-29+93*x+112*x^2+236*x^3-1316*x^4-2198*x^5+789*x^6+6313*x^7+7528*x^8+4880*x^9+2308*x^10+660*x^11+64*x^12)/((1-x)^3*(1+x+x^2)*(-1+2*x+2*x^2)^2*(-1+3*x+19*x^3+17*x^4+2*x^5)))");
  }
}
