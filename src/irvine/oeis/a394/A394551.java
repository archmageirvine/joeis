package irvine.oeis.a394;

import irvine.oeis.gf.EgfSequence;

/**
 * A394551 allocated for Yogesh G. Phalak.
 * @author Sean A. Irvine
 */
public class A394551 extends EgfSequence {

  /** Construct the sequence. */
  public A394551() {
    super(0, "exp(-(x*(1+x)/(1-x)^3))");
  }
}
