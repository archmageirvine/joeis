package irvine.oeis.a394;

import irvine.oeis.gf.EgfSequence;

/**
 * A394551 a(n) = n! * [x^n] exp(-Li_{-2}(x)), where Li_{-2}(x) = x*(1+x)/(1-x)^3 is the polylogarithm of order -2.
 * @author Sean A. Irvine
 */
public class A394551 extends EgfSequence {

  /** Construct the sequence. */
  public A394551() {
    super(0, "exp(-(x*(1+x)/(1-x)^3))");
  }
}
