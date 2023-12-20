package irvine.oeis.a067;

import irvine.oeis.FilterSequence;

/**
 * A067523 The smallest prime with a possible given digit sum.
 * @author Sean A. Irvine
 */
public class A067523 extends FilterSequence {

  /** Construct the sequence. */
  public A067523() {
    super(1, new A067180(), NONZERO);
  }
}
