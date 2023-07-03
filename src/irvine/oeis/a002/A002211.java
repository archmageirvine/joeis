package irvine.oeis.a002;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A002211 Continued fraction for Khintchine's constant.
 * @author Sean A. Irvine
 */
public class A002211 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A002211() {
    super(0, new A002210());
  }
}
