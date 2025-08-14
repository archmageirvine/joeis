package irvine.oeis.a036;

import irvine.oeis.gf.DenominatorGfSequence;

/**
 * A036281 Denominators in Taylor series for x * cosec(x).
 * @author Sean A. Irvine
 */
public class A036281 extends DenominatorGfSequence {

  /** Construct the sequence. */
  public A036281() {
    super(0, 2, "x*csc(x)");
  }
}

