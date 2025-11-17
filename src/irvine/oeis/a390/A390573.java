package irvine.oeis.a390;

import irvine.oeis.gf.EgfSequence;

/**
 * A390573 allocated for Enrique Navarrete.
 * @author Sean A. Irvine
 */
public class A390573 extends EgfSequence {

  /** Construct the sequence. */
  public A390573() {
    super(0, "2/(2-x^2*sinh(x))");
  }
}
