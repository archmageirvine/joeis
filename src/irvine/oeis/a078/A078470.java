package irvine.oeis.a078;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A078470 Continued fraction for zeta(3/2) (A078434).
 * @author Sean A. Irvine
 */
public class A078470 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A078470() {
    super(0, new A078434(), 100);
  }
}

