package irvine.oeis.a323;

import irvine.oeis.gf.GfSequence;

/**
 * A323629 List of 6-powerful numbers (for the definition of k-powerful see A323395).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A323629 extends GfSequence {

  /** Construct the sequence. */
  public A323629() {
    super(1, "8*x*(12-10*x-x^7)/(x-1)^2");
  }
}
